// Java program to remove duplicates from an array 


import java.util.Scanner;  //for taking input
import java.util.ArrayList;  //for using ArrayList 
import java.util.Collections;  //for sorting ArrayList 

//creating a class 
class Solution{
    
    //function to remove duplicates from array 
    static ArrayList remove_duplicates(int arr[]){
        
        //declaring resutant ArrayList 
        ArrayList<Integer>ls=new ArrayList<Integer>();
        
        ls.add(arr[0]);  //adding first element 
        for(int i=1;i<arr.length;i++){  //iterating from first element to last 
            int j;
            for(j=0;j<i;j++){ //iterating from start 
                if(arr[j]==arr[i])break;  //if same element 
            }
            if(j==i)ls.add(arr[i]);  //if no same element found 
        }
        
        Collections.sort(ls);  //sorting ArrayList using Collections class 
        return ls;  //returning ArrayList 
        
    }
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //creating Scanner obj 
        int size=inp.nextInt();  //input size 
        
        int arr[]=new int[size];  //declaring array 
        
        for(int i=0;i<size;i++)arr[i]=inp.nextInt();  //taking input array 
        
        ArrayList<Integer>res=new ArrayList<Integer>(); //creating new ArrayList 
        res=remove_duplicates(arr);   //function to remove duplicates from array 
        
        //displaying elements from ArrayList 
        for(int i=0;i<res.size();i++)System.out.print(res.get(i)+" ");
        
    }
}
