/* Linked list :
    
    -Linear data structure consisting of nodes linked using pointers.
    -Stored at non-contiguous loaction.
    -Dynamic size, ease of insertion/deletion.
    -Traversal access is there.
    -Each node consists of 
                        PART 1 -value
                        PART 2 -pointer
                        
*/


// Program to create a linked list


#include<bits/stdc++.h>
using namespace std;

//creating class Node
class Node{
  public:
  int data;
  Node *next;
  
};


// Function to print linked list
// Taking the head pointer as argument
void print_list(Node *p){
    while(p != NULL){   // while p is not NULL
        cout<<p->data<<endl;   // output value
        p=p->next;     // store the next node address || update the value of p everytime
    }
}



int main(){
    
    // Creating pointers to class 'Node' and storing address of newly created dynamic Node 
    Node *head=new Node();
    Node *second=new Node();
    Node *third=new Node();
    Node *fourth=new Node();
    
    // accessing elements of pointers
    head->data=215;
    head->next=second;
    
    second->data=598;
    second->next=third;
    
    third->data=43;
    third->next=fourth;
    
    fourth->data=26;
    fourth->next=NULL;
    
    
    //Printing linked lists, giving argument as 'head pointer'
    print_list(head);
    
    
    return 0;
}

