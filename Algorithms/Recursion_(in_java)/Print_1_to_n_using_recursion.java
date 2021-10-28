// Printing '1 to n' using Recursion 

import java.util.Scanner;

class MyClass{
    
    /*Declaring a static variable :
      - One copy only available for all functions, accessed without creating an object 
    */
    static int n;
    
    
    //declaring static function 
    //One copy only available , can be called without creating an object 
    static void print(int x){
        //base condn 
        if(x>n)return;
        
        //work 
        System.out.print(x+" ");
        
        //recursive call 
        print(x+1);
        
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        n=inp.nextInt();
        
        print(1);  //calling function 
    }
}

