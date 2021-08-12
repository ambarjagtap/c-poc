/* program to take multi word string */
#include<iostream>
#include<string.h>
using namespace std;

int main(){
    char name[30];

    std::cout<<"type your name :"<<std::endl;
    gets(name);
    

    std::cout<<"Your name is :"<<std::endl;
    puts(name);

    return 0;

}