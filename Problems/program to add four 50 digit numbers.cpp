/* program to add four 50 digit numbers */

#include<bits/stdc++.h>
using namespace std;

int main(){
    //numbers 
    string num1="37107287533902102798797998220837590246510135740250"; 
    string num2="46376937677490009712648124896970078050417018260538";
    string num3="74324986199524741059474233309513058123726617309629";
    string num4="91942213363574161572522430563301811072406154908250";
    
    //length of each number
    int size=sizeof(num1)/sizeof(num1[0]);

    //reverse each number to add digits   
    reverse(num1.begin(),num1.end());
    reverse(num2.begin(),num2.end());
    reverse(num3.begin(),num3.end());
    reverse(num4.begin(),num4.end());
    
    int carry=0;  string res=""; 
    
    //iterate over all digits
    for(int i=0;i<size;i++){
        int sum=(num1[i]-48)+(num2[i]-48)+(num3[i]-48)+(num4[i]-48)+carry;
        res.push_back(sum%10 + '0');  //push num into string (+48) to reach correct ascii value
        carry=sum/10;
    }
    
    // last left carry
    if(carry)res.push_back(carry+'0');
    
    // reverse string to display
    reverse(res.begin(),res.end());
    
    cout<<res;
    
    return 0;
    
}

