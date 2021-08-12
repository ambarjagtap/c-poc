#include<stdio.h>
#include<conio.h>
int factorial(int);
void main(){
    
    int n;
    printf("Enter number to get factorial :");
    scanf("%d",&n);

    int x=factorial(n);
    printf("FACTORIAL %d= %d",n,x);
    getch();
}

int factorial(int x){
    int fact=1;
    for(int i=x;i>=1;i--){
        fact=fact*i;
    }
    return fact;
    
}