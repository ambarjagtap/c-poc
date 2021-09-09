// C++ program to remove vowels from a string 

#include<iostream>
#include<string>

using namespace std;

//function to remove vowels from string 
string remove_vowels(string str){
    
    // new empty string 
    string res="";
    
    //iterating all elements of string 
    for(int i=0;i<str.length();i++){
        // if there is a vowel, then continue
        if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'
           ||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U')continue;
           
        // else push char in new string    
        res.push_back(str[i]);
    }
    
    // output the result
    return res;  
}

int main(){
    
    // input the string 
    string str; getline(cin,str);    
       
    //call function
    cout<<remove_vowels(str);
    
    return 0;
}
