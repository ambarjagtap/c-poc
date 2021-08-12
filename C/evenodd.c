#include<stdio.h>
#include<conio.h>
void main(){
    int n;
    printf("Enter any number :");
    scanf("%d",&n);
    
    if(n%2==0){
        printf("number is even.");
    }
    else{
        printf("number is odd.");
    }
    getch();
}