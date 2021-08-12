//print all names of cities is ascending order regarding their size

#include<bits/stdc++.h>
using namespace std;


void sort(string s[], int n)
{
    for (int i=1 ;i<n; i++)
    {
        string temp = s[i];
 
        // Insert s[j] at its correct position
        int j = i - 1;
        while (j >= 0 && temp.length() < s[j].length())
        {
            s[j+1] = s[j];
            j--;
        }
        s[j+1] = temp;
    }
}
  

int main(){
    
    string str[]={"mumbai","pune","bangalore","indore","chennai"};
    int n=sizeof(str)/sizeof(str[0]);
    
    
    sort(str,n);
    
    for(int i=0;i<n;i++)cout<<str[i]<<endl;
    
    return 0;
    
}



