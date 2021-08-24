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
         It solves the diamond problem.
*/



// Program to demonstrate "VIRTUAL FUNCTIONS" 

#include<iostream>
using namespace std;

class Base{
    public:
    
    //create virtual function
    virtual void print(){
        cout<<"Print base class"<<endl;
    }
  
    //create member function
    void show(){
        cout<<"Show base class"<<endl;
    }
    
};


//Inherit properties/member functions of base class to derived class for function overriding
class Derived: public Base{
    
    //overriding function
    void print(){
        cout<<"This is derived class"<<endl;
    }    
    
    //overriding function
    void show(){
        cout<<"Show derived class"<<endl;
    }
};

int main(){
    
    //create a pointer to base
    Base *p;
    
    //object of derived class
    Derived obj;
    
    //store address of obj
    p=&obj;
    
    //virtual function binded at runtime
    //access member function via pointer
    p->print();
    
    //non virtual function binded at compile time
    p->show();
    return 0;
}

