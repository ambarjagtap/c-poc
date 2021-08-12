/* printing a string via pointers */

#include<iostream>

int main(){
    char name[]="xyz";      // declaration of char as string(" ").

    std::cout<<sizeof(name)<<"bytes"<<std::endl; /* size is 4 bytes, means last element is '\0'. it terminates
    string */

    char *p;     // pointer p will store char data address
    p=name;     /* *p stores addrss of value of name[0] only, i.e. 'x'. p++ or p+1 means name[1] and so on.*/

    while(*p != '\0'){         // while addrss of *p is not equal to '\0' 
        std::cout<<*p<<std::endl;
        p++;                 // increases p (p+1), which contains address of next element
    }  
                                        

    return 0;
}