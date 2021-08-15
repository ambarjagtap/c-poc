#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main(){
    
    int arr[20][20];
    int i,j;
    
    // input matrix
    for(i=0;i<20;i++){
        for(j=0;j<20;j++){
            cin>>arr[i][j];
        }
    }
    
    
    
    //horizontal product
    ll prod_H=1, max_H=1;
    for(i=0;i<20;i++){
        for(j=0;j<17;j++){
            prod_H=arr[i][j]*arr[i][j+1]*arr[i][j+2]*arr[i][j+3];
            
            if(prod_H>max_H)max_H=prod_H;
        }
    }
    
    
    //vertical product
    ll prod_V=1, max_V=1;
    for(i=0;i<17;i++){
        for(j=0;j<20;j++){
            prod_V=arr[i][j]*arr[i+1][j]*arr[i+2][j]*arr[i+3][j];
            if(prod_V > max_V)max_V=prod_V;
        }
    }
    
    //diagonal product right
    ll prod_D_R=1,max_D_R=1;
    for(i=0;i<17;i++){
        for(j=0;j<17;j++){
            prod_D_R=arr[i][j]*arr[i+1][j+1]*arr[i+2][j+2]*arr[i+3][j+3];
            if(prod_D_R>max_D_R)max_D_R=prod_D_R;
        }
    }
    
    //diagonal product left
    ll prod_D_L=1,max_D_L=1;
    for(i=0;i<17;i++){
        for(j=3;j<20;j++){
            prod_D_L=arr[i][j]*arr[i+1][j-1]*arr[i+2][j-2]*arr[i+3][j-3];
            if(prod_D_L>max_D_L)max_D_L=prod_D_L;
        }
    }
    
    //maximum product of four elements
    ll res=max(max(max(max_H,max_V),max_D_L),max_D_R);
    
    
    cout<<res<<endl;
    
    
    // Down below is the code to display the four elements
    
    //horizontal product
    prod_H=1, max_H=1;
    for(i=0;i<20;i++){
        for(j=0;j<17;j++){
            prod_H=arr[i][j]*arr[i][j+1]*arr[i][j+2]*arr[i][j+3];
            
            if(prod_H>max_H)max_H=prod_H;
            if(max_H==res){
                cout<<arr[i][j]<<" "<<arr[i][j+1]<<" "<<arr[i][j+2]<<" "<<arr[i][j+3]<<" ||"<<i+1<<"th row "<<j+1<<"th element";
                return 0;
            }
        }
    }
    
    
    //vertical product
    prod_V=1, max_V=1;
    for(i=0;i<17;i++){
        for(j=0;j<20;j++){
            prod_V=arr[i][j]*arr[i+1][j]*arr[i+2][j]*arr[i+3][j];
            if(prod_V > max_V)max_V=prod_V;
            if(max_V==res){
                cout<<arr[i][j]<<" "<<arr[i+1][j]<<" "<<arr[i+2][j]<<" "<<arr[i+3][j]<<" ||"<<i+1<<"th row "<<j+1<<"th element";
                return 0;
            }
        }
    }
    
    //diagonal product right
    prod_D_R=1,max_D_R=1;
    for(i=0;i<17;i++){
        for(j=0;j<17;j++){
            prod_D_R=arr[i][j]*arr[i+1][j+1]*arr[i+2][j+2]*arr[i+3][j+3];
            if(prod_D_R>max_D_R)max_D_R=prod_D_R;
            if(max_D_R==res){
                cout<<arr[i][j]<<" "<<arr[i+1][j+1]<<" "<<arr[i+2][j+2]<<" "<<arr[i+3][j+3]<<" ||"<<i+1<<"th row "<<j+1<<"th element";
                return 0;
            }
        }
    }
    
    //diagonal product left
    prod_D_L=1,max_D_L=1;
    for(i=0;i<17;i++){
        for(j=3;j<20;j++){
            prod_D_L=arr[i][j]*arr[i+1][j-1]*arr[i+2][j-2]*arr[i+3][j-3];
            if(prod_D_L>max_D_L)max_D_L=prod_D_L;
            if(max_D_L==res){
                cout<<arr[i][j]<<" "<<arr[i+1][j-1]<<" "<<arr[i+2][j-2]<<" "<<arr[i+3][j-3]<<" ||"<<i+1<<"th row "<<j+1<<"th element";
                return 0;
            }
        }
    }
    
    
    return 0;
}
