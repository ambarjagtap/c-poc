/*Fibonacci series : 0,1,1,2,3,5,8,13,21,34.....
                     0,1,0+1=(1),1+(1)=(2),1+(2)=3,.....*/


#include<stdio.h>
#include<conio.h>
void fibonacci(int);
void main(){
    int n;
    printf("Enter the limit :");
    scanf("%d",&n);

    fibonacci(n);
    getch();
}
void fibonacci(int n){
    int a=0,b=1,c=0,i;

    for(i=1;i<=n;i++){
        
        printf("%d,",a);
        c=a+b; 
        a=b;         
        b=c;    
        
    }
}

