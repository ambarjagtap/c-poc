/* we can pass variable name, data type , expression, pointer in sizeof() function */

#include<stdio.h>
#include<conio.h>

void main(){
    char ch;

    printf("\n size of char : %d bytes",sizeof(char));
    printf("\n size of int  : %d bytes",sizeof(int));
    printf("\n size of short: %d bytes",sizeof(short));
    printf("\n size of float: %d bytes",sizeof(float));
    printf("\n size of double: %d bytes",sizeof(double));

    printf("\n Enter a string to get size  :");
    scanf("%c",&ch);
    printf("\n The size of string is : %d bytes",ch);

    getch();
}