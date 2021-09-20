// java program to print "Hollow Square"

import java.util.Scanner;
// java.lang is by default imported 


class Pattern{
    
    // method to print Hollow Square 
    void print(int n){
        // for rows 
        for(int r=0;r<n;r++){
            
            // for columns in each row 
            for(int c=0;c<n;c++){
                if(r==0||r==n-1){   //condition for first and last row  
                    System.out.print("*"+" ");
                }
                else{  // condition for rest of mid rows 
                    if(c==0||c==n-1){  // condition for first and last columns, rest and rest of columns 
                        System.out.print("*"+" ");
                    }
                    else System.out.print(" "+" ");
                }
            }
            System.out.print("\n");  // next row 
        }
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in); // create a Scanner object 
        
        int n=inp.nextInt(); // input size 
        
        Pattern obj=new Pattern(); // create object of Pattern class 
        obj.print(n); // invoke method related to object 
        
    }
}
