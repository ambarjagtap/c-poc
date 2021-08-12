/*new and delete operator*/
/* compile time memory allocation is static.
run time memory allocation is dynamic .
we use new(assign memory) and delete(delete memory) operator to assign and delete memory in runtime(dynamic memory allocation) */

/* eg. int *p= new int; 
       int *p= new int[5];
       int *p= new int(25);   //assigning value

*/

#include<iostream>

int main(){

    //PART I
    std::cout<<"Part I"<<std::endl;

    int *p=new int; //creating memory of int type and storing that addrss in pointer p

    *p=100;  //storing data at memory addrss

    std::cout<<*p<<std::endl;  //output value @addrss of p

    delete p;  //deallocate memory



    //part II (creating array and storing inputs)
    std::cout<<"\nPart II"<<std::endl;
    
    int size;
    std::cout<<"Enter size :"<<std::endl;
    std::cin>>size;
    
    int *q=new int[size];  //creating memory spaces for int type array , and storing adddress of int[0] at p

    std::cout<<"\nEnter elements :"<<std::endl;
    for(int i=0;i<size;i++){
        std::cin>>*(q+i);   //stores input at each memory location 
    }  

    printf("\n\n");
    //printing array
    for(int i=0;i<size;i++){
        std::cout<<*(q+i)<<" "<<std::endl;
    }

    delete[] q;  //deleting array allocated by new operator

    return 0;
}
