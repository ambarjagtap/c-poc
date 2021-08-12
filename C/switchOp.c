#include<stdio.h>
#include<conio.h>
void main(){
    char ch;
    printf("ENTER :-\n\n\"m\" for Monday\n\"t\" for tuesday\n\"w\" for wednesday\n\"h\" for thursday\n\"f\" for friday\n\"s\" for saturday\n\"u\" for sunday.\n ");
    scanf("%c",&ch);
    switch(ch){
        case 'm':case 'M':printf("Monday");break;
        case 'T':case 't':printf("Tuesday");break;
        case 'W':case 'w':printf("Wednesday");break;
        case 'H':case 'h':printf("Thursday");break;
        case 'F':case 'f':printf("Friday");break;
        case 'S':case 's':printf("Saturday");break;
        case 'U':case 'u':printf("Sunday");break;
        default:printf("Wrong input");break;

    }
    getch();
}