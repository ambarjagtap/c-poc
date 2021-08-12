/*Program to calculate LCM(Least common multiple) of two numbers */

#include<iostream>

int main(){
    int a,b,lcm;

    std::cout<<"Enter two numbers :"<<std::endl;
    std::cin>>a>>b;

    if(a>b){lcm=a;}
    else{lcm=b;}
    

    while(1){
        if(lcm%a==0 && lcm%b==0){
            std::cout<<"LCM = "<<lcm<<std::endl;
            break;
        }
        lcm++;
    }

    return 0;
}