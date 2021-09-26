/*
  Simple Interest :
  Write a program to calculate the simple interest. Input consists of 3 values. 
  1 - Principle (P) 
  2 - No.of. years (n) 
  3 - Rate of Interest (r) 
  The output consists of one value Simple Interest (SI).

  Sample Input:
  1200

  2

  5.4

  Sample output:
  Simple Interest = 129.600006
*/

// Java program to find SI:

import java.util.Scanner;

class Main{
  	static double si(double p,double t,double r){
    	return (p*r*t)/100;
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	double p=inp.nextDouble();
      	double t=inp.nextDouble();
      	double r=inp.nextDouble();
      	System.out.printf("%.6f",si(p,t,r));
    }
}
