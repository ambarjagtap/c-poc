/* 'K' largest elements using using Min Heap
    - Build a Min Heap(MH) of the first 'k' elements from arr[0] to arr[k-1]. 
    - For each element after 'k', compare it with root of MH.
    - If the element is greater than root of MH, then make it the root. 
    - The root of MH is the largest element.
    

*/


import java.io.*;
import java.util.*;


class MyClass{
    
    
    // utility function 
    public static void FirstKelements(int arr[],int len,int k){
        
        //Creating a MinHeap for given array with 'k' elements using PriorityQueue
            
        PriorityQueue<Integer>mh=new PriorityQueue<>();
        
        for(int i=0;i<k;i++){   //adding 'k' elements to PriorityQueue 
            mh.add(arr[i]);
        }
        
        //loop for each element from 'k'
        for(int i=k;i<len;i++){
            
            //if current element is smaller tha minimum(top element of mh), then continue
            if(mh.peek() > arr[i])continue;
            
            //else replace the top element 
            else{
                mh.poll();  //remove the first element 
                mh.add(arr[i]);  //add new element 
            }
            
        }
        
        
        //printing mh
        Iterator it=mh.iterator();   //creating Iterator
        while(it.hasNext())System.out.print(it.next()+" ");
        
   }
    
    
    // main driver function 
    public static void main(String[] args){
        
        int arr[]={11,3,5,20,8,55,24,84,97,2};
        
        int len=arr.length;
        
        int k=3;
        
        //invoke function 
        FirstKelements(arr,len,k);
        
    }
    
}
