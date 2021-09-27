/*
  Fibonacci series:
    -Program to print the Fibonacci series up to n number of terms.
    -Get the n from user and display the fibonacci series upto the n elements
*/

// Java program to print Fibonacci series upto 'n' elements

import java.util.Scanner;

class Main{
  	static void fibo(int n){
    	int t1=0,t2=1,t3;
      	System.out.print(t1+" "+t2+" ");
      	for(int i=3;i<=n;i++){
        	t3=t1+t2;
          	System.out.print(t3+" ");
          	t1=t2;
          	t2=t3;
        }    
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int n=inp.nextInt();
    	fibo(n);
    }
}

