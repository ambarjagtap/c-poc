// Java program to print Alphabet triangle 


// import Scanner class 
import java.util.Scanner;


//create a class 
class Solution{
    
    
    // main method 
    public static void main(String[] args){
        
        char ch='A';
        
        
        // outer for loop for number of rows 
        for(int i=0;i<26;i++){
            
            //loop to forward print spaces in row 
            for(int j=26;j>i;j--)System.out.print(" ");
            
            //loop to print alphabets
            for(int k=0;k<=i;k++)System.out.print(ch++); 
            
            //decrement one element 
            ch--;
            
            //another loop to print right angled right pyramid 
            for(int l=0;l<=i;l++)System.out.print(--ch);
            
            //print new line 
            System.out.println(" "); 
            
            //reset char for next loop 
            ch='A';
            
        }
        
        
    }
    
}
