/* program to count number of consecutive appearances of integers */

#include<iostream>  // including class header file


int main(){   // main function
    int currval=0,val=0;  // variable declaration ,intialisation

    if(std::cin>>currval){   // ensures input is not empty
        int cnt=1;          // count 1
        while(std::cin>>val){    // getting n number of inputs
            if(val==currval){    // checking the input 
                ++cnt;           // increasing count
            } 
            else{        // if condition fails
                std::cout<<" number "<<currval<<" occurs "<<cnt<<" times. "<<std::endl;  // output
                currval=val;   // storing new 'val' in 'currval'
                cnt=1;    // reseting count
            }
        }
        std::cout<<"number "<<currval<<" occurs "<<cnt<<" times."<<std::endl;  // output
    }
    return 0;
}