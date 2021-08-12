/* bubble sort ascending order program */

/*arrays are always passed as pointers that to pointer to first element*/

#include<bits/stdc++.h>

void bubblesort(int arr[],int size){
    int i,j,temp;

    for(i=0;i<size-1;i++){   //number of passes/iterations is one less than actual size

        for(j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                
            }
        }
    }
}


void printarray(int arr[],int size){
    int i;

    for(i=0;i<size;i++){
        std::cout<<arr[i]<<" ";
    }
    printf("\n");
}


int main(){
    int size,i;

    std::cout<<"Enter size :"<<std::endl;
    std::cin>>size;

    int arr[size];

    std::cout<<"Enter elements :"<<std::endl;
    for(i=0;i<size;i++){
        std::cin>>arr[i];
    }

    std::cout<<"original array :"<<std::endl;
    printarray(arr,size);

    bubblesort(arr,size);
    
    std::cout<<"ascending order of array :"<<std::endl;
    printarray(arr,size);

    return 0;
}
