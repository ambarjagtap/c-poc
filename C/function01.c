#include<stdio.h>
#include<conio.h>

int sum(int a,int b){
    return a+b;
}
void main(){
    int a,b,c;
    printf("Enter a :");
    scanf("%d",&a);

    printf("Enter b :");
    scanf("%d",&b);

    c=sum(a,b);
}

