/* multiplying two numbers by using functions */


#include<stdio.h>  // header file
#include<conio.h>  // header file
int mult(int a,int b){    // function defi. and body 
    return a*b;    // return integer type to from where its called
}

void main(){      // function main
    int a,b,ans;  // variables define
    printf("Enter two numbers :");  // ask two numbers
    scanf("%d%d",&a,&b);   // input two numbers

    ans=mult(a,b);  // function calling, with arguments, storing return in variable 
    
    printf("%d x %d = %d ",a,b,ans);  //print answer

    getch();  
}
