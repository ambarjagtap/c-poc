     /* program to add 1 to 10 numbers */

#include<iostream>

int main(){
    int sum=0,val=1;   

    while(val<=10){  
        sum += val;
        val++;
    }

    std::cout<<"the sum of numbers from 1 to 10 is"<<sum<<std::endl;

    return 0;
    
}