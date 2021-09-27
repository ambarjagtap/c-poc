/*
   Java program to reverse a given number:
     -Program to reverse a given number.
     -Get an integer from the user and print the reverse of that number.

*/

import java.util.Scanner;

class Main{
    // function to reverse a numeber 
  	static long rev(long n){
    	long res=0;
      	while(n!=0){
        	long rem=n%10;
          	res=(res*10)+rem;
          	n=n/10;
        }
      	return res;
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	long n=inp.nextLong();
      	System.out.println(rev(n));
    }
}
