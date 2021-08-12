#include<stdio.h>
#include<conio.h>
#include<math.h>

void add(int,int);
void sub(int,int);
void mult(int,int);
void div(int,int);
void power(int,int);

void main(){
   
    int a,b;
    char ch;

    printf("\n Enter \n'+' for addition\n'-' for subtraction\n'*' for multiplication\n'/' for division\n'^' for power \n");
    scanf("%c",&ch);    
     
    printf("Enter number 'a' :\n");
    scanf("%d",&a);

    printf("Enter number 'b' :\n");
    scanf("%d",&b);
    

    switch (ch)
    {
    case '+':
        add(a,b);
        break;

    case '-':
        sub(a,b);
        break;

    case '*':
        mult(a,b);
        break;
    
    case '/':
        div(a,b);
        break;

    case '^':
        power(a,b);
        break;
    
    default:
        printf("wrong input");
        break;
    }
    getch();
}
void add(int a,int b){
    printf("%d + %d = %d",a,b,a+b);
}

void sub(int a,int b){
    printf("%d - %d = %d ",a,b,a-b);
    
}

void mult(int a,int b){
    printf("%d x %d = %d",a,b,a*b);
}

void div(int a,int b){
    float x,y;
    x=a;  y=b;
    printf("%f / %f = %f",x,y,x/y);
}

void power(int a,int b){
    double x,y;
    x=a; y=b;
    printf("%lf ^ %lf= %lf",x,y,pow(x,y));

}