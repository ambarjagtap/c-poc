#include<stdio.h>
#include<conio.h>
void main(){
    int i,sum=0;
    float avg;
    int arr[10];

    printf("\n \t\t\t\t AVERAGE OF 10 NUMBERS");

    printf("\n\nEnter elements of array :");

    for(i=0;i<10;i++){
        printf("\nEnter element %d :",i);
        scanf("%d",&arr[i]);
    }

    printf("\n\n"); //adding space

    printf("\n Elements are :\n");

    for(i=0;i<10;i++){
        printf("%d,",arr[i]);
    }

    for(i=0;i<10;i++){
        sum=sum+arr[i];
    }

    printf("\n SUM= %d",sum);

    avg=sum/10;
    printf("\n AVERAGE= %f",avg);

    getch();
}