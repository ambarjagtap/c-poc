#include<iostream>
#include<string>
using namespace std;

//function to reverse array
void reverse(string str,int start,int end){
    
    while(start<end){
        char temp=str[start];
        str[start]=str[end];
        str[end]=temp;
        
        start++;
        end--;
    }
    cout<<str;
}


int main(){

    string str;  getline(cin,str);    
    
    reverse(str,0,str.length()-1);
    
    return 0;
}
