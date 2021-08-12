#include<stdio.h>
#include<conio.h>

void main(){
    int m,n,i,j;
    printf("Enter first number :");
    scanf("%d",&m);
    printf("Enter second number :");
    scanf("%d",&n); 
    for(i=m;i<=n;i++)
    {
        for(j=2;j<i;j++){
            if(i%j==0){
                break;
            }
            if(j==i-1){
                printf("%d,",i);
            }
        
        }

    }        
                                
    getch();
}