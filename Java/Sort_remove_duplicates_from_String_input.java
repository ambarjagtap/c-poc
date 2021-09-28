/* java program to print sorted non redundant numbers from input 
    -numbers separated by ','.
*/


import java.util.Scanner;     //import Scanner class 
import java.util.ArrayList;    // import ArrayList class 
import java.util.Collections;   // import Collections class 

// create a new class
class Myclass{
    
    //method to sort array using bubble sort 
    static void bubble_sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    
    // method to remove duplicates and make single occurence
    static void rem_dupli(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[j]==arr[i])break;
            }
            if(j==i)System.out.print(arr[i]+" ");
        }
    }
    
    
    //main method     
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();  //input String including numbers and commas 
        
        String arr[]=str.split(",");   //split() method to remove ','  , it returns array of String
        
        int arr2[]=new int[arr.length];   //declare another array 
        
        // store integer values from String values into array 
        for(int i=0;i<arr.length;i++){
            arr2[i]=(int)arr[i].charAt(0)-48;
        }
        
        bubble_sort(arr2);
        rem_dupli(arr2);
    }
}
