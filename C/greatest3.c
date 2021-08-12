#include<stdio.h>
#include<conio.h>
void main()
{
    float a,b,c;
    printf("Enter any three numbers :");
    scanf("%f%f%f",&a,&b,&c);
    if (a>b&&a>c)
    {
        printf("%f is greatest.",a);
    }
    if (b>a&&b>c)
    {
        printf("%f is greatest.",b);
    }
    if(c>a&&c>b)
    {
        printf("%f is greatest.",c);
    }
    if (a==b&&a>c)
    {
        printf("%f is greatest.",a);
    }
    if(b==c&&c>a)
    {
        printf("%f is greatest.",b);
    }
    if(a==c&&a>b)
    {
        printf("%f is greatest.",a);
    }
    if(a==b&&b==c)
    {
        printf("all are equal.");
    }
    
    getch();
}