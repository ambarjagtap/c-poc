/*Program to reverse an array by using recursive call, if array has even no of elements then last first element swaps last then first+1 swaps last-1 and so on. if array has odd elements then the middle element remains at same position */

#include<bits/stdc++.h>

/*Program to reverse array by using recursive call*/
void reverseRecursive(int arr[],int start,int last){   // start=0 , last=size-1
    int temp;

    if(start>=last)return;

    temp=arr[start];
    arr[start]=arr[last];
    arr[last]=temp;

    reverseRecursive(arr,start+1,last-1);    
}



/*Program to print array*/
void printarray(int arr[],int size){
    for(int i=0;i<size;i++){
        std::cout<<arr[i]<<" ";
    }
    std::cout<<std::endl;
    
}


/*Driver function to test above functions*/
int main(){
    int size,i;
    
    std::cout<<"Input element size:"<<std::endl;
    std::cin>>size;

    int arr[size];

    std::cout<<"Enter elements"<<std::endl;

    for(i=0;i<size;i++){
        std::cin>>arr[i];
    }

    printarray(arr,size); // print original array

    reverseRecursive(arr,0,size-1);  // function call to reverse the array

    printarray(arr,size);   // print reversed array

    return 0;

}