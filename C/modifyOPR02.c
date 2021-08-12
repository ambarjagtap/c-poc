#include<stdio.h>
#include<conio.h>
void main(){
    int a,b;
    printf("Enter a nummber :");
    scanf("%d",&a);

    b=a++ + a++; // eg.take a=1, assign a_01= 1                eg.take a=12, assign a_01= 12
                 //                a++, a=1+1=2                    a++, a=12+1=13
                 //              assign a_02= 2                    assign a_02=13
                 //                a++, a=2+1=3 //a=3              a++, a=13+1=14  //a=14
                 //               b= a_01 + a_02 = 1 + 2 =3 ;      b=a_01 + a_02=12 +13 =25
                 
                 //         b=3,    a=3 ;           

    printf("b = %d++ + ++%d = %d ",a,a,b);

    getch();
}