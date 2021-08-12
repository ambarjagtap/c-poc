#include<stdio.h>
#include<conio.h>
void main(){
    int arr[10];
    int i,sum=0;
    float av;

    printf("Enter elements of an array :");

    for(i=0;i<10;i++){
        scanf("%d",&arr[i]);
    }

    printf("\n\n"); //adding space

    for(i=0;i<10;i++){
        printf("%d,",arr[i]);
    }

    printf("\n\n"); //adding space

    for(i=0;i<10;i++){
        sum=sum+arr[i];
    }

    printf("Sum=%d",sum);

    getch();
}