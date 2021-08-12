/*Elements in array are stored at contiguous memory locations*/

#include<iostream>
#include<stdio.h>

int main(){

    //in an array of 10 integers, if arr[0] is stored at address x, then arr[1] is stored at x+sizeof(int), arr[2] is stored at x+sizeof(int)+sizeof(int)

    printf("Address always contains 8 characters.\n");

    int arr[10],i;

    printf("Size of integer in this compiler is %lu \n",sizeof(int));

    for(i=0;i<10;i++){
        std::cout<<"Address of arr["<<i<<"] is "<<&arr[i]<<std::endl;
        
    }

    return 0;
}