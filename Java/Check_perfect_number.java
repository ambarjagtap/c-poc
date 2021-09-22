/* 
  Java program to check whether a number is perfect or not 
	-A perfect number is a positive integer that is equal to the sum of its proper positive
     divisors.
*/

import java.util.Scanner;

class Main{
  	String check_per(int n){
    	int sum=0;
      	for(int i=1;i<=(n/2)+1;i++){
        	if(n%i==0){
            	sum+=i;
            }
        }
      	if(sum==n)return "Yes";
      	else return "No";
    }

  	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int n=inp.nextInt();
      	Main obj=new Main();
      	System.out.println(obj.check_per(n));
    }
}
