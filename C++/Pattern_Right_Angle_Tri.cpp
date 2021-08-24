/* Pattern printing : Right angle triangle
    
    *       
    * * 
    * * * 
    * * * * 

*/

#include<iostream>
using namespace std;

void print(int n){
    int i,j;
    
    //iterating for rows
    for(i=0;i<n;i++){
        //iterating for columns
        for(j=0;j<=i;j++){
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
    
