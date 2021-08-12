                   // Simple Calculator //

#include<stdio.h>
#include<conio.h>
void main(){
    float a,b,ans;
    int o;
    printf("ENTER TWO NUMBERS :\n");
    scanf("%f%f",&a,&b);
    printf("Enter '1' for addition.\nEnter '2' for subtraction.\nEnter '3' for multiplication.\nEnter '4' for division.\n");
    scanf("%d",&o);

    switch(o){
        case 1:ans=a+b;printf("%f + %f =%f",a,b,ans);break;
        case 2:ans=a-b;printf("%f - %f =%f",a,b,ans);break;
        case 3:ans=a*b;printf("%f x %f =%f",a,b,ans);break;
        case 4:ans=a/b;printf("%f/%f =%f",a,b,ans);break;
        default:printf("Wrong input");break;
        
    }
    

    getch();
}