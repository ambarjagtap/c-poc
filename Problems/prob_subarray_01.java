/* 
   PROBLEM :
    -Input an array of size 'n'.
    -Input a number.
    -Input subarray size.
    -Find if the number is present in every sub-array or not.
    -If number is present in all sub-arrays print '1' else print '0'.
    
*/


// import java class 
import java.util.Scanner;


// create a new class 
class Solution{
    
    // main method 
    public static void main(String[] args){
        
        // create a Scanner object.
        Scanner inp=new Scanner(System.in);
        
        //input size of array and array itself
        int n=inp.nextInt(); // input array size
        int arr[]=new int[n];  // initialise array of size 'n' in dynamic memory.
        for(int i=0;i<n;i++)arr[i]=inp.nextInt(); //input elements of array 
        
        
        // input the number to search for in the sub-array  
        int num=inp.nextInt();
        
        // input the sub array size 
        int size=inp.nextInt();  
        
        // set flag as false initially 
        boolean found=false;
        
        // iterate all elements of array
        // NOTE : increase 'i' by 'size' in each iteration  
        for(int i=0;i<n;i+=size/*increase i by 'i+size'*/){
            
            // set found false 
            found=false;
            
            // iterate all elements of SUB ARRAY 
            // set 'j' as 'i= 0+size|0+2size|...', 'j<i+size' 
            for(int j=i/*set 'j' as 'i'*/; j<i+size && j<n/*n is size of subarray*/; j++){
                
                if(arr[j]==num)found=true; // if found then 'TRUE' 
                
            }
            
            if(found)continue;  // if success then 'continue' to next iteration 
            else { // if not found then,
                System.out.println(0);  // fail
                return;  // return 
            }
    
            
        } // for loop ends 
        //success 
        System.out.println(1);
    }// main method ends
    

} // class ends
