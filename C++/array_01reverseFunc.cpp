/* iterative c++ program to reverse an array by swaping elements in first and last element of array */

#include<bits/stdc++.h>

/* fucntion to reverse array from start to end. In odd terms there is no need to swap the middle number*/
void reversearray(int arr[],int start,int end){      // (array,index0,indexLast), make table
    while(start<end){
        int temp=arr[start]; // temporary store element(0) in temp
        arr[start]=arr[end]; // store last element at index0 place
        arr[end]=temp;     // store first element at indexLast of array
        start++;    
        end--;
    }
}

/* function to print array */
void printarray(int arr[],int size){
    for(int i=0;i<size;i++){
        std::cout<<arr[i];

    }
    std::cout<<std::endl;
}
/*driver function to test above functions */

int main(){
    int arr[]={1,2,3,4,5,6};
    int n=sizeof(arr)/sizeof(arr[0]);

    printarray(arr,n); // calling to print original array

    reversearray(arr,0,n-1);  //calling function, arguments(array,index[0],index[n-1])

    printarray(arr,n);  // calling to print reversed array

    return 0;
}


