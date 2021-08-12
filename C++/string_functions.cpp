#include<iostream>
#include<string>
using namespace std;

int main(){
    //intialising string
    string str;
    
    //getting string
    getline(cin,str);
    
    //declaring iterator
    std::string::iterator it;
    
    //declaring reverse iterator
    std::string::reverse_iterator it1;
    
    //displaying string
    cout<<"The string using forward iterator is :";
    for(it=str.begin(); it != str.end() ; it++){
        
        cout<<*it;
    }
    cout<<endl;
    
    //displaying reverse string
    cout<<"The reverse string using reverse iterator is :";
    for(it1=str.rbegin(); it1 !=str.rend() ; it1++){
        cout<<*it1;
    }
    cout<<endl;
    
    //insert element at endl
    str.push_back('E');
    cout<<str<<endl;
    
    //delete element at back
    str.pop_back();
    cout<<str<<endl;
    
    //display string length
    cout<<str.length()<<endl;
    
    //display string capacity in bytes
    cout<<"String capacity in bytes "<<str.capacity()<<endl;
    
    
    
    return 0;
}