//Program to check whether given number is a perfect square or not 

#include<iostream>
using namespace std;

int main(){
    
    int n;  cin>>n;
    int i=1;
    
    
    while(1){
        if(i*i==n){
            cout<<"It is perfect square of "<<i;
            
            break;
        }
        
        
        if(i*i>n){
            cout<<"It is not a perfect square";
            break;
        }
        
        i++;
    }
    
    
    return 0;
}
