/* Java program to check Palindrome or not,
    using "charAt(i)"
*/


import java.util.Scanner;

// create a class 
class Solution{
    
    
    // Declaring static void class 
    static boolean check(String str){
        
        int start=0;
        int end=str.length()-1;
        
        while(start<end){
            
            if(str.charAt(start)!=str.charAt(end))return false;
            
            start++;
            end--;
        }
        //if success
        return true;
    }
    
    
    //main method
    public static void main(String[] args){
        
        //declare Scanner object
        Scanner input=new Scanner(System.in);
        
        // input string 
        String str=input.nextLine();
        
        // check palindrome 
        if(check(str))System.out.println("True");  // if condition is true
        else System.out.println("False");       // condition false
        
      
    }    
    
}
