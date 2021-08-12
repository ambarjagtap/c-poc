
             //  getting principal  //

#include<stdio.h>
#include<conio.h>
void main(){
    float p,r,t,si;
    printf("enter principal :");
    scanf("%f",&p);
    printf("enter rate :");
    scanf("%f",&r);
    printf("enter time :");
    scanf("%f",&t);
    si=(p*r*t)/100;
    printf("principle is :%f",si);
    getch();
}