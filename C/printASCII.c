
              // ASCII value //

#include<stdio.h>
#include<conio.h>
char ascii(void);     //------function declaration
void main(){
    char ch;
    
    ch=ascii();       //------calling
    printf("\n ASCII value of %c is %d ",ch,ch);

    getch();
}

char ascii(void){     //------defining
    char ch;
    printf("\nEnter a character :");
    scanf("%c",&ch);
    return ch;
}