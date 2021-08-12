
                   // SWAP METHOD I //
#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;

    printf("Enter value of a:");
    scanf("%d",&a);

    printf("Enter value of b:");
    scanf("%d",&b);
    c=a;
    a=b;
    b=c;
    printf("a= %d, b =%d",a,b);
    getch();

}