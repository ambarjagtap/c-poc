
        
               // PRINT ASCII //

#include<stdio.h>
#include<conio.h>

void main(){
    char ch;
    char ch2;
    int a;
    printf("Enter any character  :");
    scanf("%c",&ch);
    
    printf("%c , %d,",ch,ch);
    
    a=ch;
    printf("\n %d , %c",a,a);

    printf("\n Enter char2 :");
    scanf("%c",&ch2);

    printf("\n %d, %c ",ch2,ch2);
    
    getch();

}