/*
    Binary to Octal: 
      -Write a program to convert the given binary number to its equivalent octal value.

      -Input Format:
       Input consists of integer

      -Sample Input:
        10101

      -Sample Output:
        25
*/

import java.util.Scanner;

class Main{
    //function to convert decimal to octal 
  	static int dec_to_oct(int dec){
    	  int oct=0,i=1;
      	while(dec!=0){
        	  oct+=(dec%8)*i;  
          	dec /=8;  //divide each time by 8 to get quotient until quotient is zero
          	i*=10;  // multiply i each time by '10'
        }
      	return oct;
    }
    
    // function to convert binary to decimal
  	static int bin_to_dec(String bin){
    	  int dec=0,len=0;
      	for(int i=bin.length()-1;i>=0;i--){
        	  dec+=((int)bin.charAt(i)-48)*Math.pow(2,len);
          	len++;
        }
      	return dec;
    }
  
  // main method 
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	String bin=inp.nextLine();  // take binary input as a String
      	int dec=bin_to_dec(bin);  // first convert binary to decimal 
      	System.out.println(dec_to_oct(dec));  // convert decimal to octal
    }
}
