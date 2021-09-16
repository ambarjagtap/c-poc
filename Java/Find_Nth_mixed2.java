/*
    Find Nth term of the following series :
    0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8 
    

*/


import java.util.Scanner;
// java.lang is by default imported 


class Solution{
    
    public int find(int n){
        
        if(n%2!=0){  // +2 
            return (n-1);
        }
        else{
            n=n/2;
            return n-1;
        }
        
    }
    
}

class Main{
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        
        int n=inp.nextInt();
        
        Solution obj1=new Solution();
        System.out.println(obj1.find(n));
        
    }
}
