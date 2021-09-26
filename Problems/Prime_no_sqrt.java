/*-----------------------------------------------------------------------------------
  Prime number :
    -Write a program to check whether a given number is a prime number or not.

    -If it is a prime number, find out the Square Root of that number.

    -Else it should print 0.00
    
    -Eg1.
      Input (stdin): 7
      Output (stdout):  2.65
       
    -Eg2.
      Input: 10
      Output: 0.00
------------------------------------------------------------------------------------*/

import java.util.Scanner;

class Main{
  	static double sqrt(double n,double i,double j){
		double mid=(i+j)/2;
      	if(Math.pow(mid,2)==n||Math.abs(Math.pow(mid,2)-n)<0.00001)return mid;
      	else if(Math.pow(mid,2)>n)return sqrt(n,i,mid);
      	else return sqrt(n,mid,j);
    }
  	
  	static void find_sqrt(double n){
    	boolean found=false;
      	double i=1;
      	while(!found){
        	if(Math.pow(i,2)==n){
            	System.out.println(i);
              	found=true;
            }
          	else if(Math.pow(i,2)>n){
            	double res=sqrt(n,i-1,i);
              	System.out.printf("%.2f",res);
              	found=true;
            }
           	i++;
        }
    }
     
  
  	static boolean check_prime(double n){
    	int i;
      	for(i=2;i<n;i++){
	    	if(n%i==0)return false;
        }
      	if(i==n)return true;
      	return false;
    }
  
	public static void main(String[] args){
      	Scanner inp=new Scanner(System.in);
    	double n=inp.nextDouble();
      	if(check_prime(n)){
        	find_sqrt(n);
        }
      	else System.out.println("0.00");
    }
}
