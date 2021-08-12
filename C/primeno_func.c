 
             //----PRIME NUMBER-----//


#include<stdio.h>
#include<conio.h>
void prime(int,int);  //---------DECLARATION

void main(){
   
    int m,n;
    printf("Enter first number :");
    scanf("%d",&m);

    printf("Enter second number ");
    scanf("%d",&n);

    prime(m,n);   //----------CALLING
    
    getch();
}
void prime(int m,int n){   //----------DEFINITION
    int i,j;
    for(i=m;i<n;i++){
        for(j=2;j<i;j++){
            if(i%j==0){
                break;
            }
            if(j==i-1){
                printf("%d,",i);
            }
        }
    }
}