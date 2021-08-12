#include<stdio.h>
#include<conio.h>
void main(){
    int n1,n2,i,sum=0;
    printf("Enter first number :");
    scanf("%d",&n1);
    printf("Enter second number :");
    scanf("%d",&n2);
    for(i=n1;i<=n2;i++){
        printf("%d\n",i);
        sum=sum+i;
    }
    printf("sum=%d",sum);
    getch();
}