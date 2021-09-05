/* Sorting using Selection Sort 

  *Take minimum element every time from unsorted array and place it in sorted array.
  *O(n^2)

*/


//Program to implement selection sort 

#include<iostream>
#include<algorithm>
using namespace std;

//Function to print array
void print(int arr[], int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<endl;
    }
}


//Function to do selection sorting
void selection_sort(int arr[],int n){
    
    //iterate for each element
    for(int i=0;i<n;i++){
        int min_ind=i;  //assume current 'i' as 'index as min_value_index'
        
        //iterate from i+1 to n
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_ind])min_ind=j;
        }
        
        //insert min value element at i's place
        swap(arr[i],arr[min_ind]);
    }
}



int main(){
    
    //input array
    int n;   cin>>n;  int arr[n];   for(int i=0;i<n;i++)cin>>arr[i];
    
    
    //function for selection sort
    selection_sort(arr,n);
    
    
    //function to print array
    print(arr,n);
    
    return 0;
}
