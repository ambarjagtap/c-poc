#include<iostream>

int main(){
    int n,i,f=1;

    std::cout<<"Enter a number to get factorial :"<<std::endl;
    std::cin>>n;


    for(i=n;i>=1;i--){
        f=f*i;


    }
    std::cout<<"factorial of "<<n<<" is "<<f<<std::endl;

    return 0;
    



}