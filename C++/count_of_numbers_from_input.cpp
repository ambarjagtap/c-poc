// Program to display count of numbers from input stream in C++ 

#include<iostream>
#include<vector>
using namespace std;


int main(){
    
    //declaring a temp variable 
    int temp;
    
    // declaring a vector
    vector<int>vec;  
    
    while(cin>>temp){   // check for input 
        vec.push_back(temp); // push elements in vector
    }
    
    
    // output the size 
    cout<<vec.size();
    
    return 0;
}
