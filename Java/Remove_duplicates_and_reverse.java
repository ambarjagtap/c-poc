/*
    Remove duplicates and reverse
      -Write a program that will replace multiple consecutive occurrences of a character with a single occurrence,
       and print the result in the reverse order.

       The input stream of characters should be read from STDIN and the result should be written to STDOUT. Other than the required output, no other characters / string / message should be written to STDOUT.

       You can assume that the input string length will not exceed 30 characters.
*/

/*-------------------------------------------------------------*/
import java.util.*;

class Main{
    
    // method to remove duplicates and reverse it 
    static String rr(String str){
        StringBuilder res=new StringBuilder(str);
        
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)==res.charAt(i+1)){
                res.deleteCharAt(i);
                i++;
            }
        }   
        return res.reverse().toString();
    }
    
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);   //Scanner obj 
        
        String str=inp.nextLine();     // input String 
        
        System.out.println(rr(str));    // invoke method 
        
    }
}
