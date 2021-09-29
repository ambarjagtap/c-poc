// Java program to check a String is palindrome or not using recursion

import java.util.Scanner;

class Myclass{
    
    static boolean check(String str){
        if(str.length()==1||str.length()==0)return true;
        
        if(str.charAt(0)==str.charAt(str.length()-1))
        return check(str.substring(1,str.length()-1));
        
        return false;
        
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        System.out.println(check(str));
    }
}
