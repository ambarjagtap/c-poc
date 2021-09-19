// Java program to print a "Diamond" :

import java.util.Scanner;

class Main{
    
    void print(int n){
        
      /*-----------for UPPER part of diamond-----------*/
        
        // for rows of upper half 
        for(int i=0;i<n;i++){
            // for spaces
            for(int j=n-i-1-1;j>=0;j--){
                System.out.print(" ");
            }
            
            // for stars 
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            
            // for upper right half
            for(int x=0;x<i;x++){
                System.out.print("*");
            }
            
            System.out.print("\n");  // row change 
        }
        
        /*----lower half of diamond----------------------*/
        
        //for number of rows 
        for(int i=0;i<n-1;i++){
            
            // for spaces 
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            
            //for stars 
            for(int s=0;s<=n-i-2;s++){
                System.out.print("*");
            }
            
            //for lower right half (only stars)
            for(int s=n-i-3;s>=0;s--){
                System.out.print("*");
            }
          
            System.out.print("\n");  // change to next row 
        }
    }
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  // scanner input 
        
        int n=inp.nextInt();  // input size 
        
        Main obj=new Main();  // create object of class Main to invoke method 
        obj.print(n);  // invoke method of obj 
        
    }
}
