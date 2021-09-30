/* 
    Check password:
        - Returns '1' is is a valid password, else return '0'.
        - Conditions to be a valid password :
            - At least 4 characters.
            - At least one numeric digit.
            - At least one capital letter.
            - Must not have space or slash.
            - Starting charcter must not be a number.
        
*/

import java.util.Scanner;

class Password{
    
    static int check(String str){
        if((int)str.charAt(0)>=48 && (int)str.charAt(0)<=57)return 0;
        
        if(str.length()<4)return 0;
        
        boolean flag_num=false,flag_cap=false;
        
        for(int i=0;i<str.length();i++){
            
            if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57 && i!=0)flag_num=true;
            
            if(str.charAt(i)==' ' || str.charAt(i)=='/')return 0;
            
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)flag_cap=true;
            
        }
        
        if(flag_num==true && flag_cap==true)return 1;
        else return 0;
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        System.out.println(check(str));
    }
}
