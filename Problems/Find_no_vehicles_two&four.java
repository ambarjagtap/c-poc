/*
    Problem: Find number of two wheelers and number of four wheelers.
        - Input total number of vehicles(two_wheelers + four_wheelers).
        - Input total number of wheels(W).
    
    Sample input : 200
                   540
    Sample output: 130
                   70
*/


//import Scanner object 
import java.util.Scanner;

//create a class 
class Solution{
    
    // method to find number of vehicles || V=number of total vehicles,W=number of total wheels
    void find_vehicles(int V,int W){
        
        int no_two,no_four; // declare to int variables for 'number of two' and 'number of four' wheelers
        
        for(no_two=1;no_two<V;no_two++){  
            for(no_four=1;no_four<V;no_four++){
                if(no_two+no_four==V && no_two*2+no_four*4==W)
                    System.out.println(no_two+" "+no_four);
            }
        }
    }
    
    
    // main method 
    public static void main(String[] args){
        
        //create Scanner object
        Scanner inp=new Scanner(System.in);
        
        //input number of vehicles 
        int V=inp.nextInt();
        
        //input number of wheels 
        int W=inp.nextInt();
        
        //create object to invoke method 
        Solution obj=new Solution();
        obj.find_vehicles(V,W); // invoke method by passing arguments
    }
    
}
