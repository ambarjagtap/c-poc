
                // STARS SEQUENCE 02 //

 
#include<stdio.h>
#include<conio.h>
void main(){
    int i,j,k;
    int n;

    printf("\n \t\t\t\t  STARS SEQUENCE");
    
    printf("\n  enter number of rows :");
    scanf("%d",&n);

    for(i=1;i<=n;i++){
        for(j=n;j>=i;j--){
            printf(" ");
        }
        for(k=1;k<=i;k++){
            printf("*");
        }
        printf("\n");
    }
    getch();
}