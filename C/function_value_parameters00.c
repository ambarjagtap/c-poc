#include<stdio.h>
#include<conio.h>
int divide(int);
int mult(int,int);

void main(){
    int a,b;
    printf("Enter two numbers :");
    scanf("%d%d ",&a,&b);

    printf("multilply %d, %d and divivde by 2 gives %d",a,b,divide(mult(a,b)));

    getch();
}

int mult(int x,int y){
    return x*y;
}

int divide(int x){
    return x/2;
}