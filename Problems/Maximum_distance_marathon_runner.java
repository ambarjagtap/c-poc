/*______________________________________________________________________________________________________
  PROBLEM: Maximum Distance Marathon Runner :-
  A marathon is a long-distance race with an official distance of 42.195 kilometers, 
  usually run as a road race or footrace.

  A local marathon was organized at Pune. The distance actually covered by the participants has been
  recorded in an array R[] which is an integer array holding the values in kilometers. If there are N
  number of participants who started running at a particular time, then the size of R is N. The 
  participants should cover a distance more than 0.0 km to get recorded in array R[].

  Find the maximum distances covered by 3 highest racers excluding finishers. If there are only one or
  two racers excluding finishers, give their distances covered.

  R[] will be Input float array. Write a code to take Input array R[], and return 3 maximum distances
  excluding Finishing Distance d, d = 42.195 km
-------------------------------------------------------------------------------------------------------
  Example 1:

  Input Values:

  Enter the distances covered by racers in Marathon (Kilometers) please
  (press q to terminate):

  42.195
  42.195
  42.195
  33.25
  40
  41.2
  38.9
  37.5
  q

  Output Values:
  Highest Distance excluding Finishers:
  [41.2, 40, 38.9]
--------------------------------------------------------------------------------------------------------
  Example 2:
  Input Values:
  Enter the distances covered by racers in Marathon (Kilometers) please

  (press q to terminate):

  33.33
  42.9
  39.56
  -35.6
  42.195
  q

  Output Values:
  Highest Distance excluding Finishers:
  Invalid Input
______________________________________________________________________________________________________*/
// importing classes
import java.util.*;
import java.io.*;
import java.lang.*;

// create a class Main
class Main
{
   // method to sort elements using bubble_sort
   void bubble_sort(double arr[],int n){
  	for(int i=0;i<n-1;i++){  // number oaf swaps
		for(int j=0;j<n-i-1;j++){ // iteration across elements 
        	if(arr[j]<arr[j+1]){
            	double temp=arr[j];
              	arr[j]=arr[j+1];
              	arr[j+1]=temp;
            }
        }
  	  }
   }
  
   // method to print result 
   void print(double arr[],int n){
  	int cnt=0;
    for(int i=0;i<n;i++){
    	if(cnt==3)break;
      	if(arr[i]!=42.195){
        	System.out.print(arr[i]+" ");
          	cnt++;
        }
     } 
  }
  
  // main method
  public static void main(String args[])
  {
    // Creating Scanner object
    Scanner inp=new Scanner(System.in);
    double arr[]=new double[50]; // declaring array of type Double
    int ind=0; // index for array
    
    // while loop
    while(true){
    	  String temp=inp.nextLine(); // input element into String
      	if(temp.charAt(0)=='q'||temp.charAt(0)=='Q')break; // quit
    	  double d=Double.parseDouble(temp); //Convert String to double
      	if(d>42.195||d<0){  // Invalid Input
         	System.out.println("Invalid Input");
          return;  // return from method
        }
        arr[ind++]=d; // insert element into array and increase index
    } //while loop ends
   	
    // creating object of Main class
    Main obj=new Main(); // create an object of class Main 
    obj.bubble_sort(arr,ind); // invoke method related to that object 
    obj.print(arr,ind); // invoke another method related to that object
  } // method ends 
  
}  //class ends 
