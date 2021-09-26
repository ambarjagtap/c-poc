/*
  Centigrade to Fahrenheit.
    -Write a program to input temperature in Centigrade and convert to Fahrenheit.
*/

import java.util.Scanner;

class Main{
  	static double cent_to_fahr(double n){
    	double res=(n*9/5)+32;
      	return res;
    }
    
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	double n=inp.nextDouble();
      	System.out.println(cent_to_fahr(n));
    }
}
