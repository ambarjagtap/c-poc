/*--------------------------------------------------------------------------------------------------------------------------
    PROBLEM: 
        Write a program to encipher given 'character' using given 'key'.
        Coding scheme: a/A=0 , b/B=1, ...........z/Z=25.
        
        Example:
            Input: First line is 'character'. ->[B]
                   Second line is 'key'. ->[10]
                   
            Output: Character -> [L]
            
            Explanation: 1 + 10 = 11 OR L 
            
-------------------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;

class Main{
    
    //function to encipher 
    static char encipher(char ch,int key){
        
        // if character is upper case 
        if(Character.isUpperCase(ch)){   // if upper case 
            
            /*---------------------------------------------
               1. Convert ch to ASCII by (int)
               2. '-65' convert to A/a=0, B/b=1, c/C=2.....
               3. '+key' to encipher.
               4. modulo26 to get remainder. 
               5. +65 OR +97 to convert to char.
            ---------------------------------------------*/   
            return (char)(((((int)ch-65)+key)%26)+65);
            
        }
        else{  // lower case 
            
            return (char)(((((int)ch-97)+key)%26)+97);
        }
        
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        
        // input char 
        char ch=inp.next().charAt(0);
        
        // input key 
        int key=inp.nextInt();
                
        // invoke encipher function(char,int_key)
        System.out.println(encipher(ch,key));
        
    }
}

