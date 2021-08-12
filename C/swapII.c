
               // SWAP METHOD II  //
#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b;
    printf("Enter number 'a' :");
    scanf("%d",&a);

    printf("Enter number 'b' :");
    scanf("%d",&b);

    a=a+b;/* eg. a=3,b=7*/
    b=a-b;
    a=a-b;
    printf("value of 'a' is :%d \n",a);
    printf("value of 'b' is :%d",b);
    getch();



}