/*
  Perfect square:
    -Program to check whether the integer is a perfect square.
    -Get an input from the user and display "YES" if it is a perfect square else display " NO" as output.
    
*/


import java.util.Scanner;

class Main{
  	static String check(int n){
    	int i;
      	for(i=1;i<n;i++){
        	if(Math.pow(i,2)==n)
              	return "YES";
        }
      	if(i==n)return "NO";
      	return "NO";
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int n=inp.nextInt();
      	System.out.println(check(n));
    }
}
