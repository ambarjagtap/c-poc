/*
    Java program to print pattern:
        - Input: 3
        - Output: 
                    1
                    2*3
                    4*5*6                       
                    4*5*6
                    2*3
                    1

*/

import java.util.Scanner;  //import Scanner class 
import java.util.ArrayList;   //import ArrayList class 

class Main{
    
    //driver method
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //create Scanner object
        int n=inp.nextInt();    //input 'n'
        new Solution().print(n);  //create an instance of class ,object and invoke method 
    }
}

//class Solution
class Solution{
    //method to print pattern
    void print(int n){
        
        //creating an ArrayList of type String 
        ArrayList<String>ls=new ArrayList<String>();
        
        int num=1;
        for(int r=0;r<n;r++){   //for rows of upper half 
            String str="";  //empty String 
            for(int c=0;c<(r*2)+1;c++){     //for columns 
                if(c%2!=0){     //odd rows 
                    System.out.print("*");
                    str+="*";       //append to string 
                }
                else {                          //even rows 
                    System.out.print(num);
                    str+=Integer.toString(num);    //append to String 
                    num++;
                }    
            }   
            ls.add(str);  //add the String to ArrayList 
            System.out.println();  //new line 
        }
        
        num--;
        
        for(int r=n-1;r>=0;r--){
            System.out.print(ls.get(r));    //print the ArrayList from back end 
            System.out.println();
        }
        
    }
}
