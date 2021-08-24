/* Program to print inverted Right Angle Triangle

* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 


*/


#include<iostream>
using namespace std;

void print(int n){
    
    int i,j;
    
    // iterating number of rows
    for(i=n;i>0;i--){
        //iterating number of columns
        for(j=1;j<=i;j++){
            cout<<"*"<<" ";
        }
        cout<<endl;
    }
    
}


int main(){
    
    int n;  cin>>n;
    
    print(n);
    
    return 0;
}

