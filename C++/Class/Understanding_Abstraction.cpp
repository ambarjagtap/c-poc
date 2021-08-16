/*  
    Understanding Abstraction :

    Abstraction refers to hiding useful and sensitive data while display non essential data.
    It is achieved using access modifiers like private, public, protected. 
    
    *increases security
    *reusable code
    *avoids redundancy

*/


#include<bits/stdc++.h>
using namespace std;

//create a class
class Implement_abstraction{
    
    //data members private (can be accessed from within a class)
    private:
    int a,b;
    
    //can be accessed from anywhere
    public:
    
    //set values
    void set(int x, int y){
        a=x;
        b=y;
    }
    
    //display values
    void display(){
        cout<<"a = "<<a<<" "<<"b = "<<b;

    }
    
};


int main(){
    
    //create a object of class "Implement_abstraction"
    Implement_abstraction obj;
    
    // call the functions related to the object
    obj.set(5,10);
    obj.display();
    
    return 0;
}

