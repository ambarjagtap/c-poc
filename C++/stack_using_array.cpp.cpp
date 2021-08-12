#include<iostream>
#include<cstdlib>
using namespace std;
#define SIZE 10  //define size = 10

int stack[SIZE],top=-1;  //globally declared variables

void push(int value){       //inserting element
    if(top==SIZE-1){
        cout<<"Stack is full"<<endl;
    }
    else{
        top++;
        stack[top]=value;
    }
}

void pop(){    //deleting an element
    if(top==-1){
        cout<<"Stack is empty"<<endl;
    }
    else{
        top--;
    }
}

void display(){   //displaying an element
    if(top==-1){
        cout<<"Stack is empty"<<endl;
    }
    else{
        for(int i=top; i>=0; i--){
            cout<<stack[i]<<" ";
        }
        cout<<endl;
    }
}

int main(){
    int choice,value;
    while(1){    //infinit loop
        cin>>choice;
        switch(choice){
            case 1:
                cin>>value;
                push(value);
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
                break;
            default:
                cout<<"Wrong input"<<endl;
                return 0;
        }
    }
    
    return 0;
}

