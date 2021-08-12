#include<stdio.h>
#include<conio.h>

void main(){
    float x;
    int n;
    printf("Enter float :");
    scanf("%f",&x);
    
    n=(int) x; //cast type (type) variable;

    printf(" n = %d",n);
    getch();
}