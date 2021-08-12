
                    // PALINDROME //

#include<stdio.h>
#include<conio.h>
int palindrome(int);  //--------DECLARATION
void main(){

    int n,result;

    printf("Enter a number :");
    scanf("%d",&n);

    result=palindrome(n);   //--------CALLING
    if(result==1){
        printf("\npalindrome");
    }
    else{
        printf("\nNot a palindrome");
    }
    getch();
}
int palindrome(int n){       //-------DEFINITION
    int temp=n,a,rev=0;
    while(n>0){
        a=n%10;
        rev=rev*10+a;
        n=n/10;
    }
    printf("reverse=%d",rev);
    if(rev==temp){
        return 1;
    }

}