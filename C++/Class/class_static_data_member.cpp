/*program to create and define class, and static data member */

#include<iostream>

class test{  //create class/datatype 

    //by default private data members
    int no;  //object of int type(data member)
    
    static int cntSTATIC;  //static object of int type(data member)
    /*STATIC data member has only one copy, this copy is accessed by every object(ob1,ob2,ob3) , changes are universal. other data members have several copies when accessed by other objects*/

    int cnt=0;  // has several number of copies when accessed by several objects (resets its value)


    public: 

    void getvalue(int);  //member function declaration

    void dispvalue(void);  //member function declaration

}; //class ends


//defining member function of class
void test::getvalue(int x){    //RETURNTYPE CLASS::FUNCTION(ARGUMENT)
    
    no=x;  //"no" is already declared in class, assigning x to no

    std::cout<<"Number = "<<no<<std::endl;

    cntSTATIC++;  //increase count of static member(holds value, only one copy)

    cnt++; //increase count of non static member(several copies),(resets its value to 0 every each time)
}


//defining member function of class
void test::dispvalue(void){   //RETURNTYPE CLASS::FUNCTION(ARGUMENT)

    std::cout<<"STATIC counter = "<<cntSTATIC<<std::endl;  //print the static counter
    std::cout<<"NON STATIC counter = "<<cnt<<" (resets value for every object)"<<std::endl;  //print non static counter
}


//define static data member outside class (mandatory)
int test::cntSTATIC;


int main(){
    int x;

    test ob1,ob2,ob3;  //creating objects of class/datatype

    ob1.dispvalue(); //calling member function of object
    ob2.dispvalue(); //calling member function of object
    ob3.dispvalue(); //calling member function of object

    std::cout<<"Enter number :"<<std::endl;
    std::cin>>x;
    ob1.getvalue(x);  //calling member function of object with argument

    std::cout<<"Enter number :"<<std::endl;
    std::cin>>x;
    ob2.getvalue(x);  //calling member function with argument

    std::cout<<"Enter number :"<<std::endl;
    std::cin>>x;
    ob3.getvalue(x);  //calling member function with argument

    //calling member functions of objects again,  (to display)
    ob1.dispvalue();
    ob2.dispvalue();
    ob3.dispvalue();

    return 0;
}