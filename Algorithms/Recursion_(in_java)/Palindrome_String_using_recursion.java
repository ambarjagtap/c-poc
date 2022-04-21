// java program to check palindrome using recursion : 

import java.util.Scanner;

class MyClass{
    
    static boolean check_palindrome(String str){
        if(str.length()==1||str.length()==0)return true;
        
        if(str.charAt(0)==str.charAt(str.length()-1))
            return check_palindrome(str.substring(1,str.length()-1));   //str.substring(int_begin,int_end + 1); returns substring from 'int_begin' to 'int_end'
        
        return false;
    }
    
    
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
      
        System.out.println(check_palindrome(str));
    }
}
