/*
    Consider the following series:
    1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,.....

*/


import java.util.Scanner;
// java.lang is by default imported 


class Solution{
    
    int find(int n){
        int cnt=2; //set index as '2'
        int t1=1,t2=2,t3; // initialise elements 
        
        //while loop 
        while(true){
            cnt++;
            
            t3=t1+t2;
            t1=t2;
            t2=t3;
            if(cnt==n)return t3;
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
