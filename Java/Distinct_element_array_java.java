// Java program to print distinct elements of array


//import utilities packages
import java.util.*;
import java.lang.*;
import java.io.*;


// create a class
class Print_distinct_elements{
        
        //Method to print array :-
        // 'static' means that only one copy is available for each object 
        //  and it can be invoked without any object.
        static void print_array(int arr[],int n){
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
        }
        
        
        //function to print distinct elements of array 
        void distinct_elements(int arr[],int n){
            
            //creating a new array
            int R[]=new int[n];
            
            //intialise first element
            R[0]=arr[0];
            
            //variable for counting and array indexing
            int res=1;  //as one distinct element
            
            //iterate 'i' from '1' to 'n'
            for(int i=1;i<n;i++){
                //intialise 'j=0' every time
                int j=0;
                
                //iterate 'j' from '0' to 'i-1' to check for same elements
                for(j=0;j<i;j++){
                    if(arr[j]==arr[i])break;  // if same element then break
                }
                
                // if success, then insert element in R[]
                if(j==i)R[res++]=arr[i];
            }
            
            System.out.println("Number of distinct elements are : "+res);
        
            
            //invoke print method to print resultant array
            // 'static' means only one copy is available and which is shared by every object
            // and can be called without an object
            print_array(R,res);
            
        }
        
        
        
        // main method
        public static void main(String[] args){
            
            //create Scanner object to input data
            Scanner obj=new Scanner(System.in);
            
            //input size of array || invoke nextInt() method of object 'obj' of class Scanner
            int n=obj.nextInt();
            
            
            /* declaring/allocating array in Java :
                    * Arrays are always allocated dynamically in java.
                    * Arrays are objects in java. We can find length of array by invoking 'length' method.
            */
            int arr[]=new int[n];  //dynamically we allocated array of size 'n'
            
            // Taking array input
            for(int i=0;i<n;i++)arr[i]=obj.nextInt();
            
            
            // invoking function to print distinct elements by 
            // creating an object of class Print_distinct_elements
            Print_distinct_elements obj1=new Print_distinct_elements();
            obj1.distinct_elements(arr,n);
            
        }
}
