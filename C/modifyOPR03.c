#include<stdio.h>
#include<conio.h>
void main(){
    int a=1,b;
    printf(" a = 1 \n");


    b= ++a + ++a ;
    
    printf("b= ++a + ++a = %d",b);

    getch();
}