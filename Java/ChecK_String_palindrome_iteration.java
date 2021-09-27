/*
  Write a Program to check whether a string is a palindrome or not:

    -Sample input:
      wow
  
    -Sample output:
      wow is a palindrome

*/

import java.util.Scanner;

class Main{
  	static void check_palindrome(String str){
    	int l=0;
      	int r=str.length()-1;
      	while(l<=r){
        	if(str.charAt(l)!=str.charAt(r))break;
          	l++;
          	r--;
        }
      	if(l>=r)System.out.println(str+" is a palindrome");
      	else System.out.println(str+" is not a palindrome");
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	String str=inp.nextLine();
      	check_palindrome(str);
    }
}
