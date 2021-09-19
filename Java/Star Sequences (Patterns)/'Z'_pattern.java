// Java program to print 'Z' :


import java.util.Scanner;
// java.lang is by default imported 

// create Pattern 
class Pattern{
    
    // method to print 'Z'
    void print(int n){
        
        //iterate for number of rows 
        for(int r=0;r<n;r++){
            // if it is first row
          if(r==0){
                for(int s=0;s<n;s++){  // print all stars 
                    System.out.print("*");
                }
                System.out.print("\n");  // next row 
                continue; // next iteration of row
            }
            
            //if it is last row 
            if(r==n-1){
                // print all stars i.e.=size
                for(int s=0;s<n;s++){
                    System.out.print("*");
                }
                System.out.print("\n");
                continue; // continue to next iteration 
            }
            
            // for spaces
            for(int i=n-r-2;i>=0;i--){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("\n");
                        
        } // for loop ends 
        
    }  // method ends 
    
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //Scanner object 
        
        int n=inp.nextInt();  // take input size 
        
        // check input validity
        if(n<3 || n>20){
            System.out.println("Invalid Input");
            return;
        }
        
        // create obj of Pattern class 
        Pattern obj=new Pattern();
        obj.print(n);  // invoke method 
        
    }
}
