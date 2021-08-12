                              // program to understand array //

#include<stdio.h>   // header file
#include<conio.h>   // header file
void main(){
    int arr[5]={45,21,59,3,32};   // array of five elements declared, defined 
    int i;   // variable int type declared

    for ( i = 0; i < 5; i++)    // for loop, (start;condition;do)
    {
        printf("%d ,",arr[i]);   
    }


    
    printf("\n\n %d %d",arr[0],arr[3]);  // printing elements of array
    
    printf("\n \t Enter loop :");   // entering loop
    
    for(i=0;i<5;i++){          // for loop (start;condition;do),loop for taking input for array
        printf("\n Enter the element[%d] :" , i);  
        scanf("%d",&arr[i]);
    }

    printf("\n\n\n\n\n\n\n ");  // adding space
    
    for(i=0;i<5;i++){    // loop for printing array
        printf(" %d ,",arr[i]);
    }

    getch();

}
