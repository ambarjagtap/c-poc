/*
    Problem: 
        - Input an array of size 'n' containing digits '0' and '1'.
        - '0' represents biker running North.
        - '1' represents biker running South.
        
        The task is to find crossing bikers in such a way that each pair of crossing bikers (N,S) OR (0,1).
        
        Sample input: 5
                      0 1 0 1 1
        Sample output: 5
*/



//import Scanner object 
import java.util.Scanner;

// create a class 
class Solution{
    
    // Method to find solution 
    int check(int arr[],int size){
        int cnt=0; //counter 
        // iterate all elements to search for '0'
        for(int i=0;i<size;i++){
            //if it is '0'
            if(arr[i]==0){
                for(int j=i+1;j<size;j++){  // iterate all next elements from 'i'
                    if(arr[j]==1)cnt++;
                }
            }
        }
        return cnt;
    }
    
    //main method 
    public static void main(String[] args){
        
        //create a Scanner object 
        Scanner inp=new Scanner(System.in);
        
        // input size of array and elements of array 
        int size=inp.nextInt();
        int arr[]=new int[size]; // declare an array 
        for(int i=0;i<size;i++)arr[i]=inp.nextInt();
        /*--------------------------------------------*/
        
        
        //create an object of class Solution to invoke method 
        Solution obj=new Solution();
        System.out.println(obj.check(arr,size));
        
    }
}
