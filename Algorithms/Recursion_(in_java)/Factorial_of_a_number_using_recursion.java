// Program to find factorial of a number using recursion 


import java.util.Scanner;

//creating a class 
class MyClass{
    
    //function to find factorial 
    static int factorial(int n){
        //base condition 
        if(n==1)return 1;
        
        //recursive call
        return n*factorial(n-1);
    }
        
    
    //main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        System.out.println(factorial(n));
        
    }
}
