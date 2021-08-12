#include<stdio.h>
#include<conio.h>
void main(){
    int min,i,arr[10];

    printf("\n \t\t\t\t MINIMUM of 10 :");

    printf("\n Enter numbers in a array :");
    
    for(i=0;i<10;i++){
        printf("\n Enter element %dth :",i);
        scanf("%d",&arr[i]);
    }

    printf("\n\nThe elements of array are :");

    for(i=0;i<10;i++){
        printf("%d,",arr[i]);
    }

    min=arr[0];

    for(i=1;i<10;i++){
        if(min>arr[i]){
            min=arr[i];
            
        }

    }

    printf("\nMINIMUM=%d",min);

    getch();   
}