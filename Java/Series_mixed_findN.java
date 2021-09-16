/*
    Consider the following series:
    1,1,2,3,4,9,8,27,16,81,32,423....
    
    // for even indexed numbers pow of two 
    
    // for odd indexed numbers pow of three 
    
    Write a program to find the nth term is this series.

*/


import java.util.Scanner;
// java.lang is by default imported 

class Solution{
    
    public static int find(int n){
        
        if(n%2==0){  //for odd series
            return (int)Math.pow(3,(n-1)/2);
        }
        else{  // for even series  
            return (int)Math.pow(2,(n-1)/2);
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

