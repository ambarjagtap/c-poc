/*
  Program to check whether given number is a Strong number or not:
  
  Strong number is a special number whose sum of factorial of digits is equal to the original number. For example: 145 is strong number. Since, 1! + 4! + 5! = 145
*/

import java.util.Scanner;

class Main{
  	static int fact(int n){
    	if(n==1)return 1;
      	return n*fact(n-1);
    }	
  
  	static boolean check_strong(int num){
    	int temp=num;
      	int add=0;
      	while(num>0){
        	int rem=num%10;
          	add+=fact(rem);
          	num=num/10;
        }
      	if(add==temp)return true;
      	else return false;
    }
  	
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int num=inp.nextInt();
      	boolean res=check_strong(num);
      	if(res)	System.out.println("Yes");
      	else System.out.println("No");
    }
}
