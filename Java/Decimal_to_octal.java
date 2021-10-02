// Java program to convert decimal to binary 

import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);
      	int dec=inp.nextInt();
      	System.out.println(new Solution().dec_to_oct(dec));
    }
}

class Solution{
	int dec_to_oct(int dec){
    	int oct=0,i=1;
      	while(dec!=0){
        	oct+=(dec%8)*i;
          	dec /=8;
          	i*=10;
        }
      	return oct;
    }
}
