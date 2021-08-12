
// "&a", "&b", "&c" ... denotes addresses of memory location, not value stored. 

// *p=b , stores value of variable b at location pointed by p
// p=&b , stores address of variable b in p.

/* "const" keyword denotes that value cannot be changed (value stored or addresses)

eg.1
char b='B'; 
const char *p=&b;   is same as   char const *p=&b;  //"const" applies to left, if not then right.
const char *p=&b;  pointer p is initialised and stores address of b, and that value cannot change.

'char const' or 'const char' denotes that the variable storing character value , doesn't change its value.

eg.2
char *const p=&b;  // the memory address which p is storing(i.e. adrs of b) cant change. p will point to same memory address. value stored at addrss of b(&b) can change.
in this p stores address of b permanently as it is initialised.


eg.3
const char *const p=&a;  //value pointed by pointer cannot be changed as well as address of pointer cannot be changed.
here, value stored is value at address of a and address stored is address of a.
*/






/* program to demonstrate array of strings using 2D character array */
#include<iostream>

int main(){

    //initialise array of pointer 
    const char *colour[4]={"Blue","Red","Orange","Yellow"};  
    //here value stored cannot be changed (Read Only )
    //address of pointer can change
    //here, we are creating array of pointer and storing constant characters

    printf("\nElements of array :\n");
    for(int i=0;i<4;i++){
        std::cout<<colour[i]<<std::endl;
    }

    printf("\nFirst letter of each element of array :\n");
    for(int i=0;i<4;i++){
        std::cout<<*colour[i]<<std::endl;
    }

    printf("\nAddresses of array :\n");
    for(int i=0;i<4;i++){
        std::cout<<colour+i<<std::endl;
    }

    return 0;
}
