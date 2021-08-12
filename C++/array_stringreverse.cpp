/*program to reverse a string */

#include<bits/stdc++.h>

//function to reverse a string by using pointers
void revstring(char *p,int size){    //char *p pointer p stores addrss of str[0]
    char *pi=p;  //char type pi pointer stores addrss corresponding to p or str[0]
    char *pf=p+size-1;   //pointer *pf stores address of last string element

    char temp; //for swaping

    while(pi<pf){  //while pointerInitial < pointerFinal 
        temp=*pi;   //swaping
        *pi=*pf;    //swaping
        *pf=temp;   //swaping

        pi++;   //increase addrss by one
        pf--;   //decrease adrrs by one
    }

}

int main(){
    char str[50];

    std::cout<<"Enter string :"<<std::endl;
    gets(str);  //get input string

    char *p=str; //pointer *p of type char stores adrss of str[0]
    
    // while loop to calculate number of characters
    int cnt=0;  
    while(*p != '\0'){   //while value at addrss of p is not equal to '\0'
        cnt++;   //increase counter
        p++;    //increase address of pointer by one
    }

    std::cout<<cnt<<" characters.(including spaces)"<<std::endl;

    revstring(str,cnt); //call function, arguments(arrayString,count)

    printf("\nReversed string :\n");
    puts(str);  //prints string

    return 0;
}