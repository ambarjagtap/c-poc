// Factorial of a number in java

import java.util.Scanner;

//creating a class
class Solution{
    
    //method to find Factorial
    int fact(int n){
        int res=1;
        
        for(int i=n;i>=1;--i){
            res*=i;
        }
        return res;
    }
    
    
    //main method 
    public static void main(String[] args){
        
        //creating Scanner Object 
        // System.in is scanner input from standard input stream
        Scanner obj=new Scanner(System.in);
        
        // input a number
        int n=obj.nextInt();
        
        //output the Factorial
        // invoking method using Object
        Solution ob=new Solution();
        System.out.println(ob.fact(n));
    }
    
}
