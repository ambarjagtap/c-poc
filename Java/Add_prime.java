/*
  Sum of Prime Numbers
    -Write a program to find the sum of all prime numbers in a given range. The program should consider all the prime numbers within the range, 
     excluding the upper bound and lower bound.

  Input:
  7
  24

  Output:
  83
*/

import java.util.Scanner;

class Main{
  	static int add_prime(int low,int up){
    	int res=0;
      	for(int i=low+1;i<up;i++){
        	int j;
          	for(j=2;j<i;j++){
            	if(i%j==0)break;
            }
          	if(j==i)res+=i;
        }
      	return res;
    }
  
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int low=inp.nextInt();
      	int up=inp.nextInt();
      	System.out.println(add_prime(low,up));
    }
}
