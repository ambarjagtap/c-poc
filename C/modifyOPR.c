#include<stdio.h>
#include<conio.h>

void main(){
    int x,z,b;
    printf("Enter value of x :");
    scanf("%d",&x);
    
    z=x++;  // it first assigns x to z, then increments x to x++ and assigns x++ to x //
    z=x;    // it now assigns z=x, while x becomes x++ //
    printf("\n x++ = %d OR %d",z,x);  // print either z or x //
    
    printf("\n ++x = %d",++x);     // ++x first increments and simultaneously assigns value to x //

    printf("\n\n Enter another variable b :");
    scanf("%d",&b);
    
    b--;   //decrementing and assigning to b //
    printf("\n\n b-- = %d",b);   // printing decremented b //
    printf("\n --b = %d",--b);   // decrement and simultaneously assinging //

    getch();
}