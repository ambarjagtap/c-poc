// Java program to reverse a string using String Builder class

/*
    1- Scan input.
    2- Create a StringBuilder object and store the string.
    3- Use the build in function to reverse.
*/



// importing Scanner class 
import java.util.Scanner;


// create a class 
class Solution{
    
    // main method 
    public static void main(String[] args){
        
        // create a Scanner object 
        Scanner input=new Scanner(System.in);
        
        // input a string 
        String str=input.nextLine();
        
        // create a StringBuilder object 
        StringBuilder str2=new StringBuilder();
        
        // append into new object
        str2.append(str);
        
        System.out.println(str2.reverse());        
        
    }
    
    
}
