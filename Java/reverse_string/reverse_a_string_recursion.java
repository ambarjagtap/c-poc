// Java program to reverse a String using recursion 

import java.util.Scanner;

class Myclass{
    static void reverse(String str){
        // base condition
        if(str==null||str.length()<=1)System.out.print(str);
        else {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        reverse(str);        
    }
}
