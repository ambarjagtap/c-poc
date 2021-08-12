/*  1,2,1,3,2,5,3,7,5,11,8,13,13,17,   mixture of two series . odd terms is fibonacci series, even terms are prime numbers. write a program to get Nth term and print the corressponding value   */


#include<iostream>
#define max 1000

 

void fibonacci(int n){     // parameter is the middle number as series is mix of two series
    int i,t1=0,t2=1,nextTerm;
    for(i=1;i<=n;i++){     // run i as many times as parameter (middle number)
        nextTerm=t1 + t2;  // in fibonacci next term is sum of two previous terms
        t1=t2;             // t1 becomes t2 
        t2=nextTerm;       // t2 becomes nextTerm
    }   
    std::cout<<t1<<std::endl;   // value of t1 has fiboncci series
}



void prime(int m){
    int cnt=1,flag;
    for(int n=2;n<=max;n++){
        for(int i=2;i<n;i++){
            if(n%i==0){
                break;
            }
            if(i==i-1){
                cnt++;
            }
            if(cnt==m){
                std::cout<<m<<std::endl;
                flag=1;
                break;
            }
        }
        if(flag==1){
            break;
        }
    }
}



int main(){
    
    int n;
    std::cout<<"Enter the Nth term..."<<std::endl;
    std::cin>>n;

    if(n%2==1){       // odd term, means fibonacci number

        fibonacci(n/2+1);    // call fibonacci function, argument is the middle number

    }


    else{
        prime(n/2);        // call prime function, argument is the middle number
    }
    return 0;
}

