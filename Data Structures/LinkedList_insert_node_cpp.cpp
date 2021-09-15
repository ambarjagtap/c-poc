 /* 
    Inserting a node in a Linked List :
        -At the front  // push function
        -After a given node   // insert_after function
        -At the end    // append function

*/


#include<bits/stdc++.h>
using namespace std;

// creating class node
class Node{
    public:
    int data;
    Node *next;
};

//function to print linked List
void print(Node *p){
    while(p != NULL){
        cout<<p->data<<endl;
        p=p->next;
    }
}


//function to insert Node at beginning 
// '**p' is pointer to pointer to the head,  (*p) is pointer tp head
void push(Node **p, int new_data){
    
    // STEP 1 -> Allocate new Node in heap 
    Node *new_node=new Node();   // new_node is a pointer which stores addrss of new Node in heap
    
    // STEP 2 -> Put data in new Node
    new_node -> data = new_data;
    
    // STEP 3 -> Make next of new Node as new head of List || (*p) is pointer to head
    new_node -> next = (*p);   
    
    // STEP 4 -> Now the head pointer points to new Node
    (*p)=new_node;
    
}



// Appending a node at last
// Give pointer to pointer to head(**p) as argument, new_data as argument
void append(Node **p, int new_data){
    
    //STEP 1 -> Allocate new Node in heap, pointer new_node points to new node created in heap
    Node *new_node= new Node();
    
    //STEP 2 -> *p is pointer to head/current node
    Node *last= *p;  //create a pointer 'last' which points to/OR/ stores address of head 
    
    //STEP 3 -> Put data in new Node & this node points to NULL
    new_node->data=new_data;
    new_node->next=NULL;    
    
    //STEP 4 (if linked list is empty then make new node as head)
    // *p refers to head
    if(*p==NULL){   //is head points to NULL
        *p=new_node;   // now *p points to new_node
        return;
    }
    else{  // Traverse till last node
        while(last->next!=NULL){
            last=last->next;
        }        
    }
    
    // next of last node points to new node
    last->next=new_node;
    
}


//function to insert a node after a given node
// given prev_node, insert node after this node
void insert_after(Node *prev_node, int new_data){
    
    //STEP 1 - check if prev_node points to NULL or not_eq
    if(prev_node==NULL){
        cout<<"Given node cannot be NULL"<<endl;
        return;
    }
    
    //STEP 2 - Allocate new Node
    Node *new_node=new Node();
    
    //Enter the data & next points to next node
    new_node->data=new_data;
    new_node->next=prev_node->next; //next of new node points to next node(obtained from prev_node)   
        
    
    // next of prev_node now points to this Node
    prev_node->next=new_node;
}


// Driver code
int main(){
    
    //create a pointer to Node, pointing to NULL 
    Node *head=NULL; // NULL
    
    
    //Insert node at the beginning
    //Func(addrss,data)
    push(&head,65);    // 65 -> NULL    
    push(&head,16);    // 16 -> 65 -> NULL
    
    
    //Insert node at end (append)
    //Head refers to previous node
    append(&head,48);   // 16 -> 65 -> 48 -> NULL
    append(&head,37);   // 16 -> 65 -> 48 -> 37 -> NULL
    
    
    //Insert Node after a Node
    // func_name  (pointer of head which contains addrss of next node, data)
    insert_after(head->next,94);
    
    print(head);   //print entire linked list
    
    return 0;
}

/* output :
  16
  65
  94
  48
  37
*/

