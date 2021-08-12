
            // REVERSE A NUMBER //

#include<stdio.h>
#include<conio.h>
void main()
{
    int n,rev=0,rem;
    printf("Enter any number :");
    scanf("%d",&n);

    while (n>=1)
    {
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        
    
    }
    printf("%d",rev);

    getch();
}