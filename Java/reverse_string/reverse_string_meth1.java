// Program to reverse String in Java : Method 1
/*
      STEP 1: Input string.
      STEP 2: Convert string to char[] array.
  
*/


//importing Scanner class
import java.util.Scanner;


//creating Solution class
class Solution{

    
    //method to reverse a string
                //(array,starting index, last index)
    void reverse(char arr[],int start,int end){
        
        // loop to exchange elements
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            
            start++;
            end--;
        }
        
        //printing array by using for loop
        //char 'ch' iterates over each element of 'arr' 
        for(char ch : arr)
            System.out.print(ch);  // not 'println'
        
    }
    
    
    //main method 
    public static void main(String[] args){
        
        //creating Scanner Object
        Scanner obj=new Scanner(System.in);
        
        //input String
        String str=obj.nextLine();
        
        //Convert string to char array 
        // STEP 1: define arr[]
        // STEP 2: use built in function to convert string to char[] array
        char arr[]=str.toCharArray();
        
        
        //invoking method by creating an Object
        Solution ob=new Solution(); 
        
                //(array,index 0, length)
        ob.reverse(arr,0,arr.length-1);
        
    }
}
