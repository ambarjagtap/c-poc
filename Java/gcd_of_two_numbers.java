// Java program to find greatest common divisor two numbers

import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
    	int num1=inp.nextInt();
      	int num2=inp.nextInt();
      	Solution obj=new Solution();
      	System.out.println(obj.find(num1,num2));
    }
}


class Solution{
	int find(int num1,int num2){
      	int gcd=0;
    	if(num1==num2)return num1;
      	else if(num1<num2){
        	gcd=num1;
          	while(gcd>0){
            	if(num1%gcd==0&&num2%gcd==0){
                	return gcd;
                }
            gcd--;
            }
        }
      	else{
        	gcd=num2;
          	while(gcd>0){
            	if(num1%gcd==0&&num2%gcd==0){
                	return gcd;	
                }
            gcd--;
            }
        }
    return gcd;
    }
}
