/* program that outputs product of two objects */

#include<iostream>  // include iostream class
#include "Sales_item.h"   // include class

int main(){
    Sales_item total; //  class variable/object to hold data

    if(std::cin>>total){  // checking input is true
        Sales_item trans;  // variable to hold running sum

        while(std::cin>>trans){   // running inputs into 'trans' one after other.
            if(total.isbn()==trans.isbn()){      // if member functions are equal.
                total += trans;                

            }
            else{
                std::cout<<total<<std::endl;
                total=trans;  
            }
        } 
        std::cout<<total<<std::endl;
    }
    else{
        std::cerr<<"no data"<<std::endl;
        return -1;
    }
    return 0;

}