/*
    Given a maximum of hundred digit as input.
    Find the difference between sum of odd and even digits.
*/

import java.util.Scanner;
// java.lang package is by default imported by the compiler 


class Solution{
    
        public int diff(String str){
        int odd_sum=0,even_sum=0;
        
        for(int i=0;i<str.length();i++){
            if( i%2==0){   // for even indexed digits 
                even_sum+=(int)str.charAt(i)-48;        
            }
            if( i%2==1){    // for odd indexed digits
                odd_sum+=(int)str.charAt(i)-48;
            }
            
        }
        return Math.abs(even_sum-odd_sum);
    }
    
    
}


class Main{
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in); 
        
        String num=inp.nextLine();
        
        Solution obj1=new Solution();
        System.out.println(obj1.diff(num));
      
        
    }
}
