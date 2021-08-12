#include<iostream>
#include<stack>
using namespace std;

int main(){
    stack<int> foo,bar;
    foo.push(10);
    foo.push(20);
    foo.push(30);
    
    bar.push(80);
    bar.push(90);
 
    //swap
    foo.swap(bar);  //swap elements of bar into foo
    
    cout<<"after swap"<<endl;
    while(!foo.empty()){
        cout<<foo.top()<<""<<endl;
        foo.pop();
    }
    cout<<endl;
    
    
    return 0;
}