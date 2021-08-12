#include<stdio.h>
#include<conio.h>
void main()
{
    int n,t,i;
    printf("Enter number to print table :");
    scanf("%d",&n);
    for (i=1; i<=10; i++)
    {
        t=n*i;
        printf("%d x %d = %d \n",n,i,t);
    }
    getch();
}