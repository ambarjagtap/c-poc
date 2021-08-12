#include<stdio.h>
#include<conio.h>
void main(){
    int n,i,r;
    printf("Enter any number :");
    scanf("%d",&n);
    for(i=2;i<n;i++){
        if(n%i==0){r=1;break;}
    }
    if(r==1){printf("not a prime number.");}
    else{printf("prime number.");}

    getch();
}
