
        // REVERSE OF A NUMBER :  (FUNCTION) //

#include<stdio.h>
#include<conio.h>
void reverse(int);
void main(){
    int n;
    printf("Enter a number to get its reverse :");
    scanf("%d",&n);

    reverse(n);

    getch();
}
void reverse(int a){
    int b,r=0;
    while(a>0){
        b=a%10;
        r=r*10+b;
        a=a/10;
    }
    printf("\n %d",r);
    
}