/* 
    Java program to check whether entered String is valid 'identifier_name' or not :

    Rules :
        1. Identifier_name should not start with a digit.
        2. Identifier_name can have Uppercase letters, lowercase letters and digits.
        3. Identifier_name can have 'underscore_'.
        4. Identifier_name must not contain anything else than above mentioned particulars.

*/

/*--------------------------------------------------------------------------------------------------*/

import java.util.Scanner;
// java.lang is by default imported 


class Main{
    
    // function to check if String is valid identifier or not 
    boolean check(String str){
        
        // check for first element : digit or not OR should contain only alphabets or "_" 
        int flag=0; // first flag set to '0'
        for(int i=97,j=65; i<=122&&j<=90 ; i++,j++){  // iterate all alphabets  upperCase as well as lowerCase 
            if((int)str.charAt(0)==i || (int)str.charAt(0)==j || str.charAt(0)=='_'){  // conditions to check 
                flag=1;  // if success , flag=1
                break;  // break for loop 
            }
        }
        if(flag==0)return false;  // if it fails criteria for first element 
        
        
        /*-------check for rest of elements----------------------------------------------------*/
        
        for(int ch=0;ch<str.length();ch++){  // iterate all elements of String 
            int flag2=0; // new flag set to '0'
            for(int i=97,j=65 ; i<=122&&j<=90 ; i++,j++){  // for each char of String check if its alphabet or not or underscore 
                
                if((int)str.charAt(ch)==i || (int)str.charAt(ch)==j || str.charAt(ch)=='_'){ 
                    flag2=1; // if success 
                    continue; // continue to next loop 
                }
            }
            if(flag2==0){  // if not any alphabet or a underscore check for any digit 
                // check for any digit 
                for(int num=48;num<=57;num++){
                    if((int)str.charAt(ch)==num){  // if success 
                        flag2=1;  // if success 
                        continue;  // next iteration 
                    }    
                }
                
            }
            if(flag2==0)return false;  // if not any number also then return 'false'
            
        }
        return true; // if success then return true 
    }
    
    
    // main method 
    public static void main(String[] args){
        
        Scanner inp=new Scanner(System.in);
        
        String str=inp.nextLine();
        
        Main obj=new Main();
        System.out.println(obj.check(str));
        
    }
}
