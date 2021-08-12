
                    // SUM OF DIGITS //

#include<stdio.h>
#include<conio.h>
int sumofdigits(int);    //------- declaration

void main(){
    int n,ans;

    printf("Enter the number :");
    scanf("%d",&n);

    ans=sumofdigits(n);  //------- calling

    printf("\nThe sum of digits is :%d",ans);
    

    getch();

}

int sumofdigits(int x){   //----- defining
    int a,sum=0;
     
    while(x>0){
        
        a=x%10;
        sum=sum+a;
        x=x/10;
    }     
    return sum;

}

