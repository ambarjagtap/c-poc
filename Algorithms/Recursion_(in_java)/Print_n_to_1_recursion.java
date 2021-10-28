// Printing 'n to 1' using recursion 

import java.util.Scanner;

class Recursion{
    
    //declaring static global variable 
    static int n;
    
    //recursive function  
    static void print(int x){
        //base condn 
        if(x<1)return; 
        
        //work 
        System.out.print(x+" ");
        
        //recursive call 
        print(x-1);
    }
    
    // main function 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //creating Scanner obj 
        n=inp.nextInt();  //take input 
        
        print(n);  //call function  
    }
    
}
