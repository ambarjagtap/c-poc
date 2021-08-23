/* Understanding Polymorphism 

    *It is the process of using a function for more than one purpose.

    *Compile time :
        
        *Function overloading : Mutiple function with same name but different arguments/or/different
                                number of arguments.
        
        *Operator overloading : Same operator behaves differently when used with different classes. 

    *Run time :
        
        *Virtual functions : It is achieved by function overriding, when a derived class has 
         definition of one or more member functions. That member function is said to be overridden.
*/



// Program to understand "FUNCTION OVERLOADING" 

#include <iostream>
using namespace std;

//create a class
class New {
    public:
    
    //create functions of same but different arguments
    void func(int x){
        cout<<"Value of x is :"<<x<<endl;
    }
    
    void func(double x){
        cout<<"Value of x is :"<<x<<endl;
    }
    
    void func(int x,int y){
        cout<<"Value of x and y is :"<<x<<" & "<<y<<endl;
    }
};


int main() {
	
	//create object of class New
	New obj1;
	
	//passing int to member func of object
	obj1.func(5);

    //passing double to member func of object
    obj1.func(254.21);
    
    //passing two arguments to same functions
    obj1.func(4,6);
    
	return 0;
}
