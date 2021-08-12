#include<stdio.h>
#include<conio.h>
void main()
{
    int bs,da,ta,gs;
    printf("Enter basic salary :");
    scanf("%d",&bs);
    da=(20*bs)/100;
    ta=(10*bs)/100;
    gs=bs+da+ta;
    printf("Gross salary is :%d",gs);
    getch();
    
}