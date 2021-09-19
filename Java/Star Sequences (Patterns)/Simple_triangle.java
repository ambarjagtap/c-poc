// Java program to print a "Triangle" :

import java.util.Scanner;

class Main{
    
    // function to print a triangle  
    void print(int n){
        
        // iteration for rows  
        for(int i=0;i<n;i++){
            // iteration for spaces
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            // iteration for stars 
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            /*----------------------*/
            // for upper right half
            // only for stars 
            for(int x=0;x<i;x++){
                System.out.print("*");
            }
            
            System.out.print("\n");  // break to enter next row
        }
        
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        
        int n=inp.nextInt();
        
        Main obj=new Main();
        obj.print(n);
        
    }
}
