// Java program to find factorial of a number using recursion


import java.util.Scanner;

class Main{
	static int fact(int n){
    	if(n==1)return 1;
    	return n*fact(n-1);
    }  	
  
  	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int n=inp.nextInt();
      	System.out.println(fact(n));
    }
}
