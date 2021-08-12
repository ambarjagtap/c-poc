/* program to check a particular charater is there in a string or not */

#include<stdio.h>
#include<conio.h>
#include<string.h>

int where_are_you(const char *s,char c){

    int i;
    int l1=strlen(s);
    for(i=l1-1;i>=0;i--){
        if(s[i]==c){
            printf("\n %c",s[i]);
            return i;
        }
    }
    return -1;
}


int main(){
    const char *s="No big sentence";

    printf("\n %d",where_are_you(s,'b'));  // giving arguments (pointer s, character b)

    return 0;

}