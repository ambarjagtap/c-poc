// program to display table of any number //

#include<stdio.h>
#include<conio.h> 

void table();  /*declaration*/

void main(){
    table();   /*calling*/

    getch();
}


void table(){
    
    int n,i;
    printf("Enter a number to get table :\n");
    scanf("%d",&n);

    for(i=1;i<=10;i++){
        printf("%d x %d = %d \n",n,i,n*i);
    }

}     
   
    