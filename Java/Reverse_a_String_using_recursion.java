// Java program to reverse a String using Recursion 

// import Scanner class 
import java.util.Scanner;

// create main class 
class Main{
    
    // method to reverse the String using recursion
    static void reverse(String str){
        
        /* 
            base condition:
                -if String is null, print String.
                -if String length is '1' or less than '1', print the String.
                                        OR 
                -if String has only one element left, which is the last element.
        
        */
        if(str==null||str.length()<=1)System.out.println(str);   // it is also terminating statement for recursion.
        
        else{     // if String length is more than one 
            System.out.print(str.charAt(str.length()-1));    // print the last element of String 
            reverse(str.substring(0,str.length()-1));      // invoke the recursive method by inducing argument a 'substring' argument
        }
    
    }
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //create Scanner object 
        String str=inp.nextLine();   // take String input 
        reverse(str);   //invoke method to reverse string 
    }
}
