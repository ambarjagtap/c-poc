/*
    PROBLEM : To check if a string contains all 26 alphabets or not 

*/



import java.util.Scanner;
// java.lang by default imported 


class Solution{  // create a class 
    
    
    public static void main(String[] args){  //main method 
        
        Scanner inp=new Scanner(System.in); // Scanner object 
        
        String str=inp.nextLine(); // input a string 
        
        
        // using two variables in a for loop
        
        //[two var inti.]|[cond && cond]||[statments]
        for(int i=97,j=65;i<=122 && j<=90;i++,j++){  // iterating over all alphabets 
            int flag=0;
            for(int k=0;k<str.length();k++){  // iterating all elements of String 
                if((int)str.charAt(k)==i || (int)str.charAt(k)==j){   // type casting ASCII to int 
                    flag=1;
                    break;
                }
            }
            if(flag==0){ // if aplhabet is not present then return 
                System.out.println("False");
                return;
            }
            
        }
        
        // success if all alphabets are present 
        System.out.println("Success");
    }
}
