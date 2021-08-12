/*Program to print pointers and their values stored */

#include<iostream>

int main(){
    int size,i;

    std::cout<<"Enter size of array :"<<std::endl;
    std::cin>>size;

    int arr[size];
    int *pl=arr;  // pointer pl stores addrss of arr[0]

    std::cout<<"Enter the elements :"<<std::endl;
    for(i=0;i<size;i++){
        std::cin>>arr[i];
    }

    std::cout<<pl<<" "<<pl++<<" "<<++pl<<" "<<*pl<<std::endl;  /* prints addrss of arr[0], arr[0], arr[3], prints value at arr[0]*/

    return 0;
    
}