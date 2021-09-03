#include<iostream>
#include<string>
using namespace std;


int main(){

    //declare a string and get input
    string str;  getline(cin,str);    
    
    //declare iterator
    string::iterator it;
    
    //empty string 
    string res="";
    
    //iterate from end to beginning and push it in res
    for(it=str.end();it!=str.begin();it--){
        res.push_back(*it);
    }
 
    // print output   
    cout<<res;
    
    return 0;
}
