                                          /* value parameters and functions*/

#include<stdio.h>
#include<conio.h>
double x_plus_one(double);  // declaring function
int resultof(int);  //declaring function

void main(){
    int i,i01,j;
    double x;
    

    printf("Enter a number to add one :");
    scanf("%lf",&x);
    printf(" %lf ",x_plus_one(x));  // printing and calling (not storing returned value in a variable)
    printf(" %lf is initial value ",x);  // x has initial value only

    printf("\n\nEnter a number to perform calculations :");
    scanf("%d",&i);
    j=resultof(i);   //calling
    printf(" 2 x %d + 3 = %d",i,j);

    printf("\nEnter another number to perform calculations :");
    scanf("%d",&i01);
    printf("\n 2 x %d + 3 = %d (not storing value in a variable)",i01,resultof(i01));  // not storing value in a variable 

    getch();
}

double x_plus_one(double a){
    return ++a;   // returning plus one 
}

int resultof(int a){
    return (2*a+3);   // returning calculations
}