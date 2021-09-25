// Java program to find 'square root' of any number, using recursion and binary search 


//import Scanner class
import java.util.Scanner;

//main class
class Main{
  //main method
	public static void main(String[] args){
    	Scanner inp=new Scanner(System.in);     //create Scanner object 
      	double n=inp.nextInt();    // input number to find square root 
      	Solution obj=new Solution();    //create object of Solution class
      	obj.sqrt(n);  // invoke method regarding object to find square root 
    }
}

// create Solution class 
class Solution{

    // function to find decimal value between i-1 and i (j)
                         //number, 'i-1', 'i' as j
  	static double square(double n,double i,double j){
    	  double mid=(i+j)/2;  //find mid 
      	double mul=Math.pow(mid,2);   //square of mid   
      	if((mul==n)||(Math.abs(mul-n)<0.00001)) //if square is equal to num OR difference is less than 0.00001 
          	return mid;  
      	else if(mul<n)  //if square is less 
          	return square(n,mid,j);   //right half
      	else   //if square is more 
            return square(n,i,mid);  //left half  
    }
  
  //method to find square root as integer and as a double value 
	double sqrt(double n){
    	  double i=1;   //declare double obj 'i' as '1' 
      	boolean found=false;   //set boolean obj as 'false;
      	while(!found){  //while loop, exit when found=false , 
        	if(Math.pow(i,2)==n){    //if square root is positive int 
            	System.out.println(i);    //print square root 
              	found=true;  //exit while loop
            }  
            
            // if square root is a decimal value 
          	else if(Math.pow(i,2)>n){  //if power exceeds than num
                
                //invoke function to calculate decimal square root 
                //           (Number,i-1,i)
            	  double res=square(n,i-1,i);	   //declare double obj as res and invoke method 'Square' , store decimal value in res 
              	System.out.printf("%.2f",res);  //set precision as 2 and print output
              	found=true;   //exit while loop        
            }
          	i++;  //increment 'i' for next loop, if both above condn fails 
        }
        return i;
   }  //function ends 
} //class ends 
