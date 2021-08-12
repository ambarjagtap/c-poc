/* member function of class */

#include<iostream>
#include "Sales_item.h"  // including class

int main(){
    Sales_item item1,item2; // objects created out of class

    std::cout<<"Enter two book's ISBN :"<<std::endl;

    std::cin>>item1>>item2;   // taking two inputs consecutively

    if(item1.isbn()==item2.isbn()){       // checking if member functions of objects are same
        std::cout<<item1+item2<<std::endl;  // + operation on objects
        return 0;
    }
    else{
        std::cerr<<"Data must refer to same ISBN !!"<<std::endl;
        return -1;
    } 

}