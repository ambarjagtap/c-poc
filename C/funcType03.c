
// simple swaping of two numbers 

#include<stdio.h>  // header file
#include<conio.h>  // header file
void main(){       // main function starts
    void swapFunction(int,int);   // function declaration
    int a,b;      // variables definition
    printf("Enter 'a' and 'b' :");  // output for asking variables
    scanf("%d%d",&a,&b);     // input variables in memory slots(containers)

    swapFunction(a,b);    // function calling
    

    getch();
}

void swapFunction(int a,int b){    // function definition and body
    int c;   // variable declaration 
    c=a;     
    a=b;
    b=c;
    printf("a=%d,b=%d",a,b);  // output on screen
    
}