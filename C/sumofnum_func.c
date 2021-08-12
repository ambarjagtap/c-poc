
            // SUM OF DIGITS //
#include<stdio.h>
#include<conio.h>
int sumnum(int);       // declaration
void main(){
    int n,ans;
    printf("Enter a number :");
    scanf("%d",&n);

    ans=sumnum(n);     // calling
    printf("sum of digits = %d",ans);
    getch();
}

int sumnum(int n){     // defining
    int a,sum=0;
    
    while(n>0){
    
    a=n%10;
    sum=sum+a;
    n=n/10;
    
    }
    
    return sum;
}