
/*  program to take n number of inputs */

#include<iostream>  // include header file

int main(){  // main function

    int val;  // variable declaration

    while(std::cin>>val)  // while loop to take n inputs
        std::cout<<"the number entered is :"<<val<<std::endl;  // print the number
    
    return 0;  // return 0
}