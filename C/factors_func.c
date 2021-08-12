#include<stdio.h>
#include<conio.h>
void factors(int);
void main(){
    int n;
    printf("Enter a number to get factors :");
    scanf("%d",&n);

    factors(n);
    getch();
}
void factors(int n){
    int i;
    for(i=1;i<=n;i++){
        if(n%i==0){
            printf("%d,",i);
        }
    }
}

