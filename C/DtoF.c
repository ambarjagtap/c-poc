#include<stdio.h>
#include<conio.h>
void main(){
    float c,f;
    printf("Enter centigrade :");
    scanf("%f",&c);
    f=(1.8*c)+32;
    printf("fahrenheit = %f",f);
    getch();
}