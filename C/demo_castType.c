/***************************************************/
/* */
/* Demo of Cast operator */
/* */
/***************************************************/


#include<stdio.h>
#include<conio.h>

void main ()   
{ 

float x;    /* Use int float and char */
int i;
char ch;

x = 2.345; //float
i = (int) x; // conv. to int , i=2
ch = (char) x; // conv. to char
printf ("From float x =%f i =%d ch =%c\n",x,i,ch);
 
i = 45;
x = (float) i;
ch = (char) i;
printf ("From int i=%d x=%f ch=%c\n",i,x,ch);

ch = '*';
i = (int) ch;
x = (float) ch;
printf ("From char ch=%c i=%d x=%f\n",ch,i,x);

getch();

}
