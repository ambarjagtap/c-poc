/* program to find whether the given number is even or odd */

#include<iostream>

int main(){

    int num;

    std::cout<<"Enter a number :"<<std::endl;
    std::cin>>num;

    if(num%2==0){
        std::cout<<"even number"<<std::endl;


    }

    else{
        std::cout<<"odd number "<<std::endl;

    }


    return 0;

}
