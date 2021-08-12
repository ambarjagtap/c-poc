/* Program to create constructor */
/* Constructors are used to initialise objects of class*/

#include<iostream> //include iostream class
#include<string>  //include string class
using namespace std;  //using names defined under std library

class cars{   //create class/datatype
    private:

    //data members
    string company_name; //creating string object
    string model_number; //creating string object
    string fuel_type; //creating string object
    float mileage;  //creating float object
    double price;  //creating double object

    public:

    /*creating constructor --~~ always public
        1.Constructors are used to intialise objects.
        2.By default constructor is always called.
        3.constructor is called when an object is created.
        4.same name as class and no return type.
    */
    
    //creating constructor
    cars(){
        cout<<"This is a constructor."<<endl;
    }

    //creating parameterized constructor
    cars(string cname,string mname,string ftype,float m,double p){
        company_name=cname;
        model_number=mname;
        fuel_type=ftype;
        mileage=m;
        price=p;
    }

    //creating copy constructor and passing object of same type
    //creating another object by using class object
    cars(cars &obj){    // "&" means address of object
        company_name=obj.company_name;   //using another object data
        model_number=obj.model_number;   //using another object data
        fuel_type=obj.fuel_type;   //using another object data
        mileage=obj.mileage;  //using another object data
        price=obj.price;   //using another object data
    }

    
    //member functions
    //these member functions only can access data members which are private

    //function to store data from main program
    void setData(string cname,string mname,string ftype,float m,double p){
        //taking arguments

        company_name=cname;
        model_number=mname;
        fuel_type=ftype;
        mileage=m;
        price=p;
    }
    /*Data members are private and can only be accessed by public member functions*/

    //function to display data
    void displayData(){
        cout<<"Car properties :"<<endl;
        cout<<"Car company name :"<<company_name<<endl;
        cout<<"Car model number :"<<model_number<<endl;
        cout<<"Car fuel type :"<<fuel_type<<endl;
        cout<<"Car mileage :"<<mileage<<endl;
        cout<<"Car price :"<<price<<endl;
    }
}; //class ends


int main(){
    //creating three objects of cars datatype
    cars car01;  //class/datatype object;   --constructor will be called 
    cars car02;  //constructor will be called 
    cars car03;  //constructor will be called 
    cars car04("BMW","XL","Diesel",15,2500000);  //parameterised constructor is called
    cars car05=car04;  //copy constructor is called (copy car04 into --> car05)


    //calling display function to display value after constructor is called
    car01.displayData(); //calling displayData function to know intialised value by constructor
    car02.displayData(); //calling displayData function to know initialised value by constructor
    car03.displayData(); //calling displayData function to know initialised value by constructor
    car04.displayData(); //calling displayData function to know initialised value by constructor
    car05.displayData(); //calling displayData function to know initialised value by constructor

    string cname,mname,ftype; 
    float m;
    double p;

    cout<<"Enter company name :"<<endl;
    cin>>cname;

    cout<<"Enter model name :"<<endl;
    cin>>mname;

    cout<<"Enter fuel type :"<<endl;
    cin>>ftype;

    cout<<"Enter mileage :"<<endl;
    cin>>m;

    cout<<"Enter price :"<<endl;
    cin>>p;


    //accessing setData member function of class via object
    car01.setData(cname,mname,ftype,m,p); //setting values to object of class using member function 

    car01.displayData(); //displaying data of object ..., after setting value 

    return 0;
}