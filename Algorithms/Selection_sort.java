/* Selection sort 
    *O(n^2)
*/

// Java program to implement Selection sort

//import utilities
import java.util.*;
import java.lang.*;
import java.io.*;


// Creating a class named Selection_sort
class Selection_sort{
    
    //Method to do selection sort
    void sort(int arr[],int n){
        
        //Iterate each element of array
        for(int i=0;i<n;i++){
            
            //assign min_index as 'i'
            int min_index=i;
            
            //Iterate j from 'i+1' till 'n' and finding min value index
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index])min_index=j;
            }
            
            
            // statements to swap elements
            int temp;
            temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
            
        }
        
    }
    
    
    //Method to print array
    // 'static' method doesn't require any object to invoke it.
    // Only one copy of this method is available which is shared by all objects.
    static void print_array(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
    
    //Driver method main
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        
        
        //Declaring int and taking input
        int n=obj.nextInt();
        
        //declaring array
        int arr[]=new int[n];
        
        //Taking array input
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        
        //Create a object of class Selection sort dynamically
        Selection_sort ob=new Selection_sort();
        
        //invoke sort method of object of Selection_sort class
        ob.sort(arr,n);
        
        //invoke print method without object as it is 'static' method
        print_array(arr,n);
    }
}
