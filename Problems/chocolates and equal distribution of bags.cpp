#include<bits/stdc++.h>
using namespace std;

int main(){
    int arr[4];  
    int sum=0;
    
    for(int i=0;i<4;i++){
        cin>>arr[i];
        sum+=arr[i];
    }
    
    sum=sum/2;

   
    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            if(arr[i]+arr[j]==sum && i!=j){
                cout<<"YES";
                return 0;
            }
        }
    }
    
    cout<<"NO";
    return 0;
}
