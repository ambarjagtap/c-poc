// java program to find roots of Quadratic Equation : 


//importing java class 
import java.util.Scanner;

//creating class Tester 
class Tester{
    
    //Global n static variables // static because can be called without using class 
    static Scanner inp=new Scanner(System.in);  //creating Scanner obj globally  
    static int a=inp.nextInt();  
    static int b=inp.nextInt();
    static int c=inp.nextInt();
    
    
    //main method 
    public static void main(String[] args){
     
        double d=Math.pow(b,2)-(4*a*c);  //calculating discriminant 
        
        if(d==0)System.out.println("root is "+find_root(d));  //if d==0
        
        else if(d>0){
            System.out.println("The roots are :"+find_root1(d)+" , "+find_root2(d));
        }
        
        else System.out.println("The equation has no real roots.");
        
    }
    
    //method if d==0
    static double find_root(double d){
        double ans=((-b)+Math.sqrt(d))/(2*a);
        return ans;
    }
    
    //method to find first root 
    static double find_root1(double d){
        double ans=((-b)+Math.sqrt(d))/(2*a);
        return ans;
    }
    
    //method to find second root 
    static double find_root2(double d){
        double ans=((-b)-Math.sqrt(d))/(2*a);
        return ans;
    }
    
}
