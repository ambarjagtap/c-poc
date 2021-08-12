/* average of elements of array using functions */

#include<stdio.h>
#include<conio.h>

double getavg(int arr[],int size){
    int i;
    double avg,sum=0;
    for(i=0;i<size;i++){
        sum+=arr[i];
    }
    avg=sum/size;
    return avg;
}


int main(){
    
    double avg;
    int balance[5]={100,2,4,6,7};
   
    avg=getavg(balance,5);
    printf("average=%lf",avg);

    return 0;
} 