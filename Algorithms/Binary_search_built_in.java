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
/*-------------------------------------------------------------------------------------------------------------------------*/
/* 
    Java program to use in-built binary_search function of class Arrays
        -Inside java.util.Arrays;
        -Arrays.binarySearch(int_array,key); 
        -returns index else -1.

*/
/*__________________________________________________________________________________________________________________________*/

import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
import java.io.*;

class Binary_search{
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        
        int n=inp.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)arr[i]=inp.nextInt();
        
        int key=inp.nextInt();
        
        int ind=Arrays.binarySearch(arr,key);
        
        if(ind<0)System.out.println("Element not found.");
        else System.out.println("Element found at index: "+ind);
    }
    
}

