/*

  Decimal to binary:
    -Write a program to convert decimal number to binary. Convert a given decimal integer number n to its binary equivalent.
    
*/

// Java program to convert decimal to binary

import java.util.Scanner;

class Main{
  	static void dec_to_bin(int num){
    	int arr[]=new int[100];
      	int i=0;
      	while(num>0){
        	arr[i++]=num%2;
          	num=num/2;
        }
      	for(int j=i-1;j>=0;j--){
        	System.out.print(arr[j]);
        }
    }
  
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
      	int num=inp.nextInt();
      	dec_to_bin(num);
    }
}
