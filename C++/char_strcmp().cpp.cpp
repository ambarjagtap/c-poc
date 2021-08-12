//function to check input is keyword or not

#include<iostream>
#include<string>
using namespace std;

int main(){
    char str[16][10]={"break", "case", "continue", "default", "defer",
                        "else", "for", "func","goto", "if", "map", "range", "return", "struct", "type", "var"};
    
    
    char input[20];
    cin>>input;
    for(int i=0;i<16;i++){
        if(strcmp(input,str[i])==0){
    
            cout<<input<<" is a keyword."<<endl;
            return 0;
        }
    }
    cout<<input<<" is not a keyword."<<endl;
    
    return 0;
}