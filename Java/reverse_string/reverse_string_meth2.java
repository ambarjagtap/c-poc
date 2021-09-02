/* Java program to reverse an String using Method 2

    STEP 1: Input a String
    STEP 2: Create a array of bytes[] and convert string to bytes and store it in array of bytes[]
    STEP 3: Create a new array of bytes[] 
    STEP 4: Store values in array in reverse order using for loop
    STEP 5: Convert bytes[] to String and output result as String.
*/


// import Scanner Object
import java.util.Scanner;


// create a class
class Solution{
    
    
    // main Method
    public static void main(String[] args){
    
        
        // create a Scanner object 
        Scanner obj=new Scanner(System.in);
        
        // input a String using Scanner object
        String str=obj.nextLine();
        
        // creating an array of type byte[].
        // 'getBytes()' to convert String to bytes and storing it in arr[].
        byte arr[]=str.getBytes();
   
        // allocating another array of type byte[] of length arr.length  (dynamically)
        byte res[]=new byte[arr.length];    // for result 
        
        
        //storing elements in res[] in reverse order 
        for(int i=0;i<arr.length; i++){
            //store elements in resultant array in reversed order
            res[i]=arr[arr.length - 1 - i];
        }
        
        // print the output 
        // Type cast byte[] to string and allocate new memory for String res
        System.out.println(new String(res));
        
    }
}
