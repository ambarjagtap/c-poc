// Java program to print Fibonacci Series

// import Scanner class
import java.util.Scanner;


// Create a class
class Solution{
    
    //main method 
    public static void main(String[] args){
        
        //create Scanner object 
        Scanner input=new Scanner(System.in);
        
        //input size 
        int size=input.nextInt();
    
        int n1=0,n2=1,n3;
        
        //print first two elements of Fibonnaci Series
        System.out.print(n1+" "+n2+" ");
        
        for(int i=2;i<size;i++){
            
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
        
    }
    
}
