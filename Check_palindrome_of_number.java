// Java program to check Palindrome of a number 

import java.util.Scanner;

class Main{
	static String check_palindrome(int num){
    	int copy=num,rev=0;
      	int i=1;
    	while(num!=0){
        	int rem=num%10;
          	rev=rev*10+rem;
          	num=num/10;
        }
      	if(rev==copy)return "Palindrome";
      	else return "Not a Palindrome";
    }
  
  	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int num=inp.nextInt();
      	System.out.print(check_palindrome(num));          
    }
}
