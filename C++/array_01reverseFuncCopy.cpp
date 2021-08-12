/*program to reverse an array */

#include<iostream>
#include<string.h>

/*Function to reverse array by swaping first and last element one by one*/
void revarray(int arr[],int size){ 
    int start=0,end=size-1,temp;

    while(start<end){
        temp=arr[start];  
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }

}

/*Function to print array*/
void printarray(int arr[],int size){
    for(int i=0;i<size;i++){
        std::cout<<arr[i]<<" ";
    }
    std::cout<<std::endl;
}

/*Main driver function*/
int main(){
    int size,i;  
    std::cout<<"Enter elements of string :"<<std::endl;
    std::cin>>size;

    int arr[size];

    std::cout<<"Enter elements"<<std::endl;
    for(i=0;i<size;i++){
        std::cin>>arr[i];
    }

    printarray(arr,size);  // function call to print array , putting arguments (array,size)

    revarray(arr,size);  // function call to reverse array

    printarray(arr,size);  // function call to print reversed array

    return 0;
}
