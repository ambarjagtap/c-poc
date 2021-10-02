/*
    PROBLEM:
        - Find if the sum is possible from the using two numbers of given array.
        - Input:
        
          54 98 54789 143 54 4 4 45 4
          241
          
          Output:
          98 143
________________________________________________________________________________________*/

/*---importing--classes-----*/
import java.util.Scanner;   //importing Scanner class 
import java.util.Collections;    //importing Collections class
import java.util.ArrayList;    //importing ArrayList class 

//Main class 
class Main{
    //main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //create Scanner class 
        String str=inp.nextLine();   //input String 
        int n=inp.nextInt();   //input sum 
        ArrayList<Integer>ls=new Solution().find(str,n);  //creating array list of Integer and storing the return ArrayList
        
        //traversing ArrayList 
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");   //printing elements
        }
    
    }
}


class Solution{
    
    //method to return elements    
    ArrayList find(String str,int n){
        String arr[]=str.split(" ");  //split String by using spaces
        int num_arr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            num_arr[i]=Integer.parseInt(arr[i]);   //converting String to Integer 
        }
        
        //creating new ArrayList
        ArrayList<Integer>ls=new ArrayList<Integer>();
        
        boolean flag=false;
        for(int i=0;i<num_arr.length;i++){
            for(int j=0;j<num_arr.length;j++){
                if((num_arr[i]+num_arr[j]==n) && i!=j){
                    ls.add(num_arr[i]);
                    ls.add(num_arr[j]);
                    flag=true;
                    break;
                }
            }
            if(flag==true)break;
        }
        
        return ls;
    }
    
}
