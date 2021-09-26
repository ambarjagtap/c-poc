/*
  Armstrong Number:
    -Find whether the given number is an armstrong or not.
    -Get a number from the user as an input and check whether it is armstrong, if it is armstrong print ARMSTRONG else print NOT AN ARMSTRONG
*/

import java.util.Scanner;

class Main{
  	static String check_armstrong(int n){
    	int temp=n;
      	int sum=0;
      	while(n!=0){
        	sum+=Math.pow(n%10,3);
          	n=n/10;
        }
      	if(temp==sum)return "ARMSTRONG";
      	else return "NOT AN ARMSTRONG";
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int n=inp.nextInt();
      	System.out.println(check_armstrong(n));
    }
}
