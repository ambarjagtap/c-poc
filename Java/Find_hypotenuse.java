/*
    Find the hypotenuse of a right triangle and print the output precision to 2 decimal values.
   
*/

// import Scanner class inside util package
import java.util.Scanner;
// java.lang is by default imported

class Main{
  // method which returns hypotenuse
  public double hyp(double p,double b){
  	return Math.sqrt(Math.pow(p,2)+Math.pow(b,2));
  }
  
  // main method
  public static void main(String[] args){
  		Scanner inp=new Scanner(System.in);   //create Scanner obj
  		double p=inp.nextDouble();    // input double
    	double b=inp.nextDouble();   // input double
    	Main obj=new Main(); 
 		  System.out.println(String.format("%.2f",obj.hyp(p,b)));   // invoke method of Main obj and set precision
  }
}
