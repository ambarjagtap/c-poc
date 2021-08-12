
             // SQUARE OF NUMBER //

#include<stdio.h>
#include<conio.h>
void main(){
    int a;
    int power(int);    //------FUNCTION DECLARATION 
    printf("Enter a number to get square :");
    scanf("%d",&a);

    int ans=power(a);  //------FUNCTION CALLING
    printf("%d^%d=%d",a,a,ans);
    

    getch();
}

int power(int a){      //------FUNCTION DEFINING
    return a*a;
}