              /* program to input data for array, and output the same */

#include<stdio.h>  // header file
#include<conio.h>  // header file
void main(){
    int arr[10];   //int variable array declaration
    int i=0;       //int variable declaration and definition   
    printf("Enter numbers of array :");   // output
    
    for(i=0;i<10;i++){     // loop for inputting all elements of array
        scanf("%d",&arr[i]);

    }

    for(i=0;i<10;i++){     // loop for printing elements of array
        printf(" %d ,",arr[i]);
    } 

    getch();
}


