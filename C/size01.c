/* this programs displays the amount of memory allocated in RAM by CPU (in bytes)*/



#include<stdio.h>
#include<conio.h>
void main(){
    int a;
   
    printf("Enter a number :");
    scanf("%d",&a);
    printf("size =%d",sizeof(a));
   
    getch();

}