// Program to print Swastik 

// importing Scanner class 
import java.util.Scanner;



//creating a class
class MyClass{
    //main method 
    public static void main(String[] args){
        //Scanner obj creation 
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();   //taking size input as int 
        new Solution().print(n);   //creating an object without a reference and invoking print method 
        
    }
}


//Solution class 
class Solution{
    
    //take input argument as Integer 
    void print(int n){
        
        //iterating each element of row 
        for(int r=0;r<n;r++){   //for rows 
            
            //if it is middle row 
            if(n/2==r){
                //iterate for columns 
                for(int c=0;c<n;c++)System.out.print("*"+" ");
            }
            
            //if first row 
            else if(r==0){
                //iterate for each column
                for(int c=0;c<n;c++){
                    //if first column
                    if(c==0)System.out.print("*"+" ");  
                    else if(c>0&&c<(n/2))System.out.print(" "+" ");    
                    else if(c>=(n/2)){
                        System.out.print("*"+" ");
                    }
                }
            }
            
            //if row is between 0 and n/2 :
            else if(r>0&&r<(n/2)){
                for(int c=0;c<n;c++){
                    if(c==0||c==(n/2))System.out.print("*"+" ");
                    else System.out.print(" "+" ");
                }
            }
            
            else if(r>(n/2)&&r<n-1){
                for(int c=0;c<n;c++){
                    if(c==(n/2)||c==n-1)System.out.print("*"+" ");
                    else System.out.print(" "+" ");
                }
            }
            else{
                for(int c=0;c<n;c++){
                    if(c>=0&&c<=(n/2))System.out.print("*"+" ");
                    else if(c==n-1)System.out.print("*");
                    else System.out.print(" "+" ");
                }
            }
            
            // change row 
            System.out.print("\n");
        }
        
        
    }
}
