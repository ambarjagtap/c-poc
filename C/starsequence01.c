
           // stars sequence 01 //

#include<stdio.h>
#include<conio.h>
void main(){
    int i,j,n;
    
    printf("\n  \t\t\t\t STARS SEQUENCE ");
    printf("\n\n Enter number of rows :");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        
        for(j=1;j<=i;j++){
            printf("*");
        }    
        
        printf("\n"); 
    }

    getch();

}