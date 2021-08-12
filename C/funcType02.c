     
// multiplication using functions

#include<stdio.h>  // header file
#include<conio.h>  // header file
int mult(int ,int);  // function declaration

void main(){       // main function start
    int a,b,ans;   // variable declaration
    printf("Enter two numbers :");   // output on screen
    scanf("%d%d",&a,&b);  // input data in variable containers

    ans=mult(a,b);        // function calling with argu. , storing value in variable
    printf(" \n %d x %d = %d",a,b,ans);  // output on screen
    getch();  
}

int mult(int a,int b)   //function definition
{                        // function body start
   
    printf("%d into %d =%d",a,b,a*b);  // output on screen
    return a*b;           // returning int type 
}
