/*real program*/
#include<stdio.h>
#include<conio.h>
#include<math.h>
void main(){
    double hypotenuse(double,double);
    
    double h,b,p;
    printf("Enter base :");
    scanf("%lf",&b);
    printf("Enter perpendicular :");
    scanf("%lf",&p);

    h=hypotenuse(b,p);
    printf("hypotenuse=%lf",h);

    getch();
}

double hypotenuse(double b,double p){
    double h;
    h=sqrt(b*b+p*p);
    return h;
}

/*.....practice program....
#include<stdio.h>
#include<conio.h>
#include<math.h>
double hypo(double,double);

void main(){
    double b,p,h;
    printf("Enter base:");
    scanf("%lf",&b);
    printf("Enter perpendicular :");
    scanf("%lf",&p);

    h=hypo(b,p);
    printf("hypotenuse =%lf",h);
    getch();
}

double hypo(double b,double p){
    double h;
    h=sqrt(b*b+p*p);
    return h;
}
*/