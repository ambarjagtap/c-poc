/*Program to reverse an array by using pointers*/
#include<bits/stdc++.h>

// function to reverse array
void revarray(int *p,int size){    //int *p stores adrss of arr[0]

    int *begin=p;  // pointer p contains addrs of arr[0]
    int *last=p+size-1; /*pointer *last of int type stores addrs of arr[last], p is addrs of  arr[o] */
    int temp;   //temporary integer used to swap contents


    std::cout<<*begin<<" "<<*last<<std::endl;  //prints first and last element
    
    /*loop to swap CONTENTS of first++ and last-- addresses */
    while(begin<last){   //while addr@begin < addrss@last     
        temp=*begin;  //content@begin--> content@temp
        *begin=*last;  //content@begin=content@last
        *last=temp;   //content@last=content@temp

        begin++;   //increase adrrss by 1
        last--;    //decrease addrrs by 1
    }

}


// driver function for above functions
int main(){
    int size,i;

    std::cout<<"Enter size :"<<std::endl;
    std::cin>>size;

    int arr[size];

    /*loop to enter elements */
    std::cout<<"Enter elements :"<<std::endl;
    for(i=0;i<size;i++){
        std::cin>>arr[i];
    }
    
    std::cout<<"\n"<<"original array :"<<std::endl;
    /*loop to print original array*/
    for(i=0;i<size;i++){
        std::cout<<arr[i]<<" ";
    }
    printf("\n");

    revarray(arr,size);  //call function to reverse, arguments(array,size)

    /*loop to print reversed array*/
    std::cout<<"Reversed array :"<<std::endl;
    for(i=0;i<size;i++){
        std::cout<<arr[i]<<" ";
    }

    return 0;
}