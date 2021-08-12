/* Circle class */

#include<iostream>
#include<string>
using namespace std;

class circle{  //create class
    
    // private data members
    private:
    double radius;
    string colour;

    public:
    //constructor with default values
    //initialising each object
    circle(double r=1.0,string str="red"){   //initialising arguments in case no arguments passed during object creation
        radius =r; //assign value to data member via constructor
        colour=str;  //assign value to data member via constructor
    }


    //member functions
    double getradius(){
        return radius;
    }

    string getcolour(){
        return colour;
    }

    double getarea(){
        return 3.14*radius*radius;
    }
};

int main(){
    
    //construct a circle object
    circle c1(1.2,"blue");   //giving arguments during initialisation 
    cout<<"Radius="<<c1.getradius()<<" Area="<<c1.getarea()<<" Color="<<c1.getcolour()<<endl;

    circle c2(3.5);  //giving arguments during initialisation +
    cout<<"Radius="<<c2.getradius()<<" Area="<<c2.getarea()<<" Color="<<c2.getcolour()<<endl;

    circle c3; //object created with no arguments (constructor gives value by default)
    cout<<"Radius="<<c3.getradius()<<" Area="<<c3.getarea()<<" Color="<<c3.getcolour()<<endl;

    return 0;
}