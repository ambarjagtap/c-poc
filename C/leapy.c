#include<stdio.h>
#include<conio.h>
void main()
{
    int y,r;
    printf("Enter any year :");
    scanf("%d",&y);
    r=y%4;
    if(r==0){
        printf("year is a leap year.");
    }
    else{
        printf("year is not a leap year.");
    }
    getch();
    
}