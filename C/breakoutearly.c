#include<stdio.h>
#include<conio.h>
int breakoutearly(int);
void main(){
    int b,ans;
    printf("Enter number 'b' :");
    scanf("%d",&b);

    ans=breakoutearly(b);
    printf("Value entered is : %d",ans);
    getch();
}

int breakoutearly(int b){
    int a=0;
    while(a<=b){
        if(a==b){
            return a; /* as soon as 'return' is executed, the loop terminates and the function also terminates before '}' */
        }
        a=a+1;
    }
}