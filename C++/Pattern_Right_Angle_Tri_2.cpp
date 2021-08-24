/*  Program to print Pattern : Right Angle Triangle

        * 
      * * 
    * * * 
  * * * * 
* * * * *

*/


#include<iostream>
using namespace std;

void print(int n){
    int i,j;
    
    // iterate number of rows
    for(i=n;i>0;i--){
        // iterate for columns
        for(j=1;j<=n;j++){
            if(j>=i)cout<<"*";
            else cout<<" ";
        }
        cout<<endl;
    }
    
    
}


int main(){
    
    int n;  cin>>n;
    
    print(n);
    
    return 0;
}


