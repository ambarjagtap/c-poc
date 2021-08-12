/* program to find four integers within an array of elements , such that the product of four elements is the highest (maximum product quadruple)  
approach 01 : scanning the highest four valued elements */

#include<bits/stdc++.h>// including all functions of standard library

int maxProductQuad(int arr[],int size){    //taking arguments as (array,size of array)
    
    if(size<4){
        return -1;
    }

    /*initialise maximum,second maximum,third maximum,fourth maximum element*/
    int max01=INT_MIN, max02=INT_MIN, max03=INT_MIN, max04=INT_MIN;
    int min04=INT_MAX,min03=INT_MAX,min02=INT_MAX,min01=INT_MAX; /*here min04 is the lowest value number, min04 < min03 < min02 < min01 */


    for(int i=0;i<size;i++){  // loop for comparing every element of array with min,max variables
        /*update maximum,second maximum,third maximum,fourth maximum*/
        if(arr[i]>max01){
            max04=max03;
            max03=max02;
            max02=max01;
            max01=arr[i];
        }
        else if(arr[i]>max02){
            max04=max03;
            max03=max02;
            max02=arr[i];
        }
        else if(arr[i]>max03){
            max04=max03;
            max03=arr[i];
        }
        else if(arr[i]>max04){
            max04=arr[i];
        }

        /*update minimum,second minimum,third minimum,fourth minimum*/
        if(arr[i]<min04){
            min01=min02;
            min02=min03;
            min03=min04;
            min04=arr[i];
        }
        else if(arr[i]<min03){
            min01=min02;
            min02=min03;
            min03=arr[i];
        }
        else if(arr[i]<min02){
            min01=min02;
            min02=arr[i];
        }
        else if(arr[i]<min01){
            min01=arr[i];
        }
 
    }
    std::cout<<"greatest four numbers :"<<"\n"<<max01<<" "<<max02<<" "<<max03<<" "<<max04<<std::endl;
    std::cout<<"lowest four numbers :"<<"\n"<<min04<<" "<<min03<<" "<<min02<<" "<<min01<<std::endl;

    return max01*max02*max03*max04;

}



// driver program to test above functions 
int main(){
    int i,size;
    std::cout<<"Enter the number of elements of array:"<<std::endl;
    std::cin>>size;

    int arr[size];

    std::cout<<"enter the elements:"<<std::endl;
    for(i=0;i<size;i++){     // loop to input elements
        std::cin>>arr[i];
    }

    std::cout<<"\n\n"<<"the array is"<<std::endl; //adding spaces

    for(i=0;i<size;i++){     // loop for printing the array
        std::cout<<arr[i]<<std::endl;
    }    


    int max=maxProductQuad(arr,size);  // calling function by putting arguments (array,size)

    if(max==-1){
        std::cout<<"No quadruple exists"<<std::endl;
    }
    else{
        std::cout<<"Maximum product of quadruple is :"<<max<<std::endl;
    }

    return 0;
}
