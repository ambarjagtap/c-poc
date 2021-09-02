// Java program to find Prime numbers between range of two numbers.


import java.util.Scanner;

// create a class
class Solution{
    
    
    void find_prime_numbers(int a,int b){
        int j;
        // iterate all members of range
        for(int i=a;i<=b;i++){
            
            //loop to check for prime numbers
            for(j=2;j<i;j++){
                if(i%j==0)break;               
            }
            //if success
            if(j==i)System.out.println(i+" ");
        }
        
    } 
    

        
    /* creating a public method
        *public: accessed from anywhere
        *static: No object required to invoke method, only one copy is available to all objects.
        *void: No value returned
    */
    public static void main(String[] args){
        
        //creating a Scanner object
        Scanner obj=new Scanner(System.in);
        
        //input two integers
        int a=obj.nextInt();
        int b=obj.nextInt();
        
        //invoke prime number function by creating an object
        Solution obj1=new Solution();
        obj1.find_prime_numbers(a,b);
    
    }    
}

