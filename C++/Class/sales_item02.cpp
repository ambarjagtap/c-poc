/* program to add two class objects */

#include<iostream>  // include IO header
#include "Sales_item.h"  // include class header

int main(){     // main functtion starts
    
    Sales_item book1,book2;  // create two variable objects of class 

    std::cout<<"Enter book 1 ISBN :"<<std::endl;   // take ISBN input
    std::cin>>book1;   

    std::cout<<"Enter book 2 ISBN :"<<std::endl;  // take ISBN input
    std::cin>>book2;
    
    std::cout<<book1+book2<<std::endl;  // output the sum of objects of class type

    return 0;

}