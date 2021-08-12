#include<stdio.h>
#include<conio.h>
void main()
{
    int n,i,f=1;
    printf("Enter any number :");
    scanf("%d",&n);
    for (i=n;i>=1;i--){
        printf("%d\t",i);
        f=f*i;
        
    }
    printf("factorial=%d",f);
    getch();
}