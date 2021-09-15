// Program to check Palindrome by while loop in java


import java.util.Scanner;
// java.lang package is default imported by compiler 


class Solution{
    
    static boolean check(String str,int len){
        int l=0,r=len;
        
        while(l<r){
            if(str.charAt(l)!=str.charAt(r))return false;
            
            l++;
            r--;
        }
        return true;
    }
    
    
    public static void main(String[] args){
        
        Scanner inp=new Scanner(System.in);
        
        String str=inp.nextLine();
        
        System.out.println(check(str,str.length()-1));
        
        
    }
}
