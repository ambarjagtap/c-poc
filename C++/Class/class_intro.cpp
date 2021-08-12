/* program to create class and use object of class*/


#include<iostream>  //include iostream class


class sum{  //create class "sum"
    
    int a,b,total; //declare int objects/variables (data members), by default private

    public: //access from anywhere

    void getdata(void);  //declare function RETURNtype FUNCidentifier(argument);

    void putdata(void);  //declare function RETURNtype FUNCidentifier(argument);

}; //class ends


//define the function used in class
void sum::getdata(void){  //RETURNTYPE CLASS::FUNCTION(ARGUMENTS) , function belongs to class

    std::cout<<"Enter a and b :"<<std::endl;
    std::cin>>a>>b;

}

//define function used in class
void sum::putdata(void){   //RETURNTYPE CLASS::FUNCTION(ARGUMENTS), function belongs to class
    total=a+b;

    std::cout<<a<<" + "<<b<<"="<<total<<std::endl;
}


int main(){
    sum obj01; // data_type/class  object, create object of datatype/class

    obj01.getdata();  //calling member function of object , member function is public, only object that class can access member function
     

    obj01.putdata();  //calling member function of object , member function is public 

    return 0;
}



