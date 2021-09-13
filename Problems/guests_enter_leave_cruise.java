/*
    A party has been organised on cruise for a limited time 't'.
        -Input time limit(in hrs).
        -Input two arrays:
            -1.For guests entering(Each element represents guests entering per hour).
            -2.For guests leaving(Each element represents guests leaving per hour).
        
        -Find maximum number of guests present at any given hour within time 't'.
        
    Sample input:
        5 (value of t)
        7 0 5 1 3 (guests entering)
        1 2 1 3 4 (guests leaving)
        
    Output: 8
        
    Explanation:
    7-1=6+ 
        0-2=4+
            5-1='8'+
                1-3=6+ 
                    3-4=5
    maximum=8                
            
*/


//import Scanner object 
import java.util.Scanner;

// create a class 
class Solution{

    // method to find maximum number of guests at any given hour 
    int max_guests(int ent[],int lea[],int t){
        
        int guests_pre=0;
        int max=0;
        
        for(int i=0;i<t;i++){
            
            guests_pre+=ent[i]-lea[i];
            if(guests_pre>max)max=guests_pre; //update max each time 
        }
        
        return max;
    }
    
    //main method 
    public static void main(String[] args){
        
        //create Scanner object 
        Scanner inp=new Scanner(System.in);
        
        // input time in hours 
        int t=inp.nextInt();
        
        // input array for guests entering 
        int ent[]=new int[t];
        for(int i=0;i<t;i++)ent[i]=inp.nextInt();
        
        // input array for guests leaving 
        int lea[]=new int[t];
        for(int i=0;i<t;i++)lea[i]=inp.nextInt();
        
        //invoke function by creating an object 
        Solution obj=new Solution();
        System.out.println(obj.max_guests(ent,lea,t));
        
    }

}
