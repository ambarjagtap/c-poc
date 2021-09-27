/*

  Nth Fibonacci Number:
    -Write a program to find the nth Fibonacci number.
    -Given a number n, your program should output the nth number in the Fibonacci sequence.

  Sample Input:
  3
  
  Sample Output:
  1
  
*/

import java.util.Scanner;

class Main{
  	static int find_fibo(int n){
    	int t1=0,t2=1,t3=0;
      	if(n==1)return t1;	
      	else if(n==2)return t2;
      	else{
        	for(int i=3;i<=n;i++){
            	t3=t1+t2;
              	if(t3==n)break;
              	t1=t2;
              	t2=t3;
            }
        }
    	return t3;
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int n=inp.nextInt();
      	System.out.println(find_fibo(n));
    }
}
