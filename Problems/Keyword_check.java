/*
Word is key :
One programming language has the following keywords that cannot be used as identifiers:
break, case, continue, default, defer, else, for, func, goto, if, map, range, return, struct, type, var

Write a program to find if the given word is a keyword or not :

-------------------------------------------------------------------------------------------------------------------------------------

Example-1

Input:
defer

Expected Output:
defer is a keyword

Example-2

Input:
While

Expected Output:
while is not a keyword

*/

import java.util.Scanner;

class Main{
  	
  	static public void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	String str=inp.nextLine();
    	String arr[]={"break","case", "continue", "default", "defer", "else", "for","func", "goto", "if"," map", "range", "return", "struct", "type", "var"};
      	int flag=0;
    	for(int i=0;i<16;i++){
        	if(str.equals(arr[i])){
            	System.out.println(str+" is a keyword");
              	flag=1;
            }
        }
      	if(flag==0)System.out.println(str+" is not a keyword");
    }
}
