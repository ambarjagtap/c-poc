/*program to print repeatable elements in a array*/

#include<iostream>

int main(){
    int size,i,j,flag=0;

    std::cout<<"Enter size of array :"<<std::endl;
    std::cin>>size;

    int arr[size];

    std::cout<<"Enter elements :"<<std::endl;
    //for loop to input elements
    for(i=0;i<size;i++){
        std::cin>>arr[i];
    }

    
    //nested for loop to check repeatable elements
    for(i=0;i<size;i++){
        for(j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
                std::cout<<arr[i]<<" is repeated."<<std::endl;
                flag=1;
            }
        }
        
    }

    if(flag==0)printf("No elements repeated.");

    return 0;
}