

                  // PERCENTAGE //

#include<stdio.h>
#include<conio.h>
void main(){
    float e,h,m,s,so,per;
    printf("Enter marks of english :");
    scanf("%f",&e);

    printf("Enter marks of hindi :");
    scanf("%f",&h);

    printf("Enter marks of maths :");
    scanf("%f",&m);

    printf("Enter marks of science :");
    scanf("%f",&s);

    printf("Enter marks of social science :");
    scanf("%f",&so);
    per=(e+h+m+s+so)/500*100;
    printf("percentage =%f",per);
    getch();
}