/* program to check whether a character is present in a name or not */

#include<iostream>
#include<string.h>

void checkChar(char *p,char ch){  /*taking arguments(creatingPointerOfTypeChar_taking addrs of name[0]
,input char) */

    int flag;  // creating flag
    int cnt=0;
    
    
    while(*p != '\0'){  /*while element at addrss of p is not equal to last element '\0' */
        if(*p==ch){     // if element at addrss of p equal to char 
            cnt++;     // increase counter every time
            flag=1;     // indicates success
        }
        p++;          // increasing addrss by 1 , i.e. to next element's addrss
    }
    if(flag != 1)std::cout<<"no character is appearing."<<std::endl;
    else{
        std::cout<<"character "<<ch<<" is appearing "<<cnt<<" times."<<std::endl;
    }
}

int main(){
    char name[30];  // create array of 30 elements
    char ch;        // character to check
    std::cout<<"Input name :"<<std::endl;
    gets(name);    // input name with spaces
    
    std::cout<<"\n\n"<<"Your name is :"<<std::endl;
    puts(name);    // prints name


    std::cout<<"\n\n"<<"Enter a character to check :"<<std::endl;
    std::cin>>ch;     // input char to check

    checkChar(name,ch);   // calling function to check character, arguments(array,charToCheck)

    return 0;

}