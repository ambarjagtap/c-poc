// Java program to find factorial using recursion


import java.util.Scanner;

// create a Solution
class Solution{
    
    // Function to find factorial using recursion
    int fact(int n){
        //base condn
        if(n==1)return 1;
        
        return n*fact(n-1);
    }
    
    
    //create a main method 
    public static void main(String[] args){
        
        //creating a Scanner Object
        Scanner obj=new Scanner(System.in);
        
        //input the Number
        int n=obj.nextInt();
        
        //calling factorial function by creating an Object
        Solution ob=new Solution();
        System.out.println(ob.fact(n));  //invoking method using object
        
    }
    
}
