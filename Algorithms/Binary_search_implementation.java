/*
    Binary Search :
        
        -Time complexity: (O)log(n).
         Space complexity: (O)1.
         
        -Uses 'Divide and conquer' rule. 
        
        -Searching an element in a sorted array by dividing the array into two halves every time, using recursion. 
        
        -If the element is:
            Case 1: If, Less than middle element, then divide the left array into two halves.
            Case 2: Else if, greater than middle element, then divide the right array into two halves.
        
        -Repeat the process until the element is found.
        
*/

import java.util.Scanner;

class Solution{
    
    // method to perform binary_search 
    int binary_search(int arr[],int l,int r,int key){
        
        if(l<=r){
            //finding mid element 
            int mid=l+(r-l)/2;
            
            //if mid element itself is the key 
            if(arr[mid]==key)return mid;
                
            // if key is less than mid element, divide left half into two halves  
            else if(key<arr[mid])return binary_search(arr,l,mid-1,key);    
            
            //if key is greater than mid element, divide right half into two halves 
            else return binary_search(arr,mid+1,r,key);
        }
        else return -1; // element not present
        
    }
    
    
    // main method 
    public static void main(String[] args){
        
        //create a Scanner object 
        Scanner inp=new Scanner(System.in);
        
        //input size of array 
        int n=inp.nextInt();
        
        //allot memory for array 
        int arr[]=new int[n];
        
        //input elements into array 
        for(int i=0;i<n;i++)arr[i]=inp.nextInt();
        
        //input element to search for 
        int key=inp.nextInt();
        
        //create an object of Solution class to invoke related method 
        Solution obj=new Solution();
        //   arguments are (array,first_index,last_index,key_to_search)
        int index=obj.binary_search(arr,0,n-1,key);
        
        if(index==-1)System.out.println("Element not present.");
        else System.out.println("Element found at index: "+index);
        
        
    }
}
