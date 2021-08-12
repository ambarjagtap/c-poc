/*program to check which and how many vowels are there in a given string */

#include<bits/stdc++.h>


int main(){
    char name[50];

    std::cout<<"Enter string :"<<std::endl;
    gets(name);   //input a string

    char *p=name; //pointer *p stores adrss of name[0]

    int cntA=0,cntE=0,cntI=0,cntO=0,cntU=0; //setting counters equal to zero

    while(*p != '\0'){   //while value at *p is not equal to '\0' which is terminator for string.
        
        if(*p == 'a'||'A'||'e'||'E'||'i'||'I'||'o'||'O'||'u'||'U'){
            switch(*p){    //switch value at *p
                case 'a': cntA++; break;
                case 'e': cntE++; break;
                case 'i': cntI++; break;
                case 'o': cntO++; break;
                case 'u': cntU++; break;
                default: break; 
            }          
        }
        p++;
    } 
    
    if(cntA>0){std::cout<<"vowel a occurs "<<cntA<<" times."<<std::endl;}
    if(cntE>0){std::cout<<"vowel e occurs "<<cntE<<" times."<<std::endl;}
    if(cntI>0){std::cout<<"vowel i occurs "<<cntI<<" times."<<std::endl;}
    if(cntO>0){std::cout<<"vowel o occurs "<<cntO<<" times."<<std::endl;}
    if(cntU>0){std::cout<<"vowel u occurs "<<cntU<<" times."<<std::endl;}


    return 0;
}