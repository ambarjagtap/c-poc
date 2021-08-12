/* program to bubble sort array in ascending order optimisingly (if the array is sorted then loop gets break) */

#include<bits/stdc++.h>

void bubblesort(int arr[],int size){
    int i,j,temp;
    bool swapped;

    for(i=0;i<size-1;i++){  //for loop for no of passes/iterations (always one less than size)
        swapped=false;

        for(j=0;j<size-i-1;j++){
            if(arr[j]>arr[j+1]){     // for descending order change sign
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                swapped=true;
            }
        }
        if(swapped==false)break;
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

   std::cout<<"enter elements :"<<std::endl;
   for(i=0;i<size;i++){
    std::cin>>arr[i];
   }

   std::cout<<"original array :"<<std::endl;
   printarray(arr,size);

   bubblesort(arr,size);

   std::cout<<"Sorted array in ascending order :"<<std::endl;
   printarray(arr,size); 

   return 0; 

}