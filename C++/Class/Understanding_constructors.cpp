/* Understanding constructors
    -Special type of member function which intialises the data members.
    -It is under public section of class.
    -Its name is same as that of class name.
    -It doesn't have a return type.
    -Compiler generates a default constructor if not defined.

*/

//Program to demonstrate constructors

#include<iostream>
using namespace std;


//create a class
class New{
    public:
    //data members
    int a,b;
    
    //creating constructors
    New(){
        a=2;  //giving default value
        b=9;  //giving default value
    }
};


int main(){
    
    //create an obj of class
    New obj;
    
    //displaying data members
    cout<<obj.a<<" "<<obj.b;
    
    return 0;   
}



