// 0,1,1,2,3,5
// C++ program to print fibbonacci numbers

#include<iostream>
using namespace std;

int main(){
    
    // input size
    int size; cin>>size;
    
    // first two elements
    int n1=0,n2=1,n3;

    //print first two elements    
    cout<<n1<<" "<<n2<<" ";
    
    //iterate from '2' till 'size-1'
    //because two numbers are already printed
    for(int i=2;i<size;i++){
            
        n3=n1+n2;
        cout<<n3<<" ";
        n1=n2;
        n2=n3;
        
    }
    
    return 0;
}
