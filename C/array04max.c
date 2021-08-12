#include<stdio.h>
#include<conio.h>
void main(){
    int arr[10];
    int max,i;

    printf("Enter elements of array :");
    for(i=0;i<10;i++){
        
        printf("\nEnter element %d :",i);
        scanf("%d",&arr[i]);

    }

    max=arr[0];

    for(i=1;i<10;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }

    printf("max = %d",max);

    getch();

}