/* Understanding Polymorphism 
    *It is the process of using a function/operator for more than one purpose.
--------------------------------------------------------------------------------------------
    *Compile time :
        *Function overloading : Mutiple function with same name but different arguments/or/different
                                number of arguments.
        
        *Operator overloading : Same operator behaves differently when used with different classes. 
    
---------------------------------------------------------------------------------------------
    *Run time :
        *Virtual functions : It is achieved by function overriding, when a derived class has 
         definition of one or more member functions. That member function is said to be overridden.
*/



// Program to demonstrate "OPERATOR OVERLOADING" 

#include<iostream>
using namespace std;


//creating a class named Complex
class Complex{
    
    //private data members (By default private)
    int real,img;
    
    
    public:
    
    //creating constructor , (called when the data members are not initialised)
    Complex(int r=0,int i=0){
        real=r; //giving default value
        img=i;  //giving default value
    }
    
    
    //Defining operator '+' for the class Complex
    //class_name "operator" operator(giving the address of obj of class)
                      //giving obj of class to be operated upon 
    Complex operator + (Complex const &obj){
        
        //create a obj to store result
        Complex res;
        
        res.real=real + obj.real;  
        res.img=img + obj.img;
        
        return res;  
    }
    
    
    
    //member function to print output
    void print(){
        cout<<real<<" + i"<<img<<endl;
    }
}; 

int main(){
    
    //creating objects of class
    Complex obj1(5,2), obj2(4,9);
    
    Complex obj3 = obj1 + obj2;
    
  
    //printing the result
    obj3.print();
    
    return 0;
}

