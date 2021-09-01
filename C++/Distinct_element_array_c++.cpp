// Program to print distinct elements of a array

#include<iostream>
using namespace std;


// function to print the array
void print(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}


// function to print distinct elements of array
void distinct_element(int arr[],int n){
    
    int R[n];  //declare a new array
    
    R[0]=arr[0]; // insert the first element

    int res=1;  //one distinct element
    
    
    // iterate i from '1' to 'n'
    for(int i=1;i<n;i++){
        // initialise j as '0' in each iteration
        int j=0;
        
        //traverse j from '0' to 'i'
        for(j=0;j<i;j++){
            if(arr[j]==arr[i])break;   // if elements are same then break
        }
        // if success, insert element in R[]
        if(j==i)R[res++]=arr[i];
        
    }
    
    cout<<"Number of distinct elements are : "<<res<<endl;
    
    // print array R[]
    print(R,res);
}


int main(){
    
    // input array
    int n;     cin>>n;  int arr[n];  for(int i=0;i<n;i++)cin>>arr[i];
    
    
    // call function
    distinct_element(arr,n);
    
    return 0;
}
