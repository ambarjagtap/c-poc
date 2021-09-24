/* 
    Java program to input matrix and output it in snake pattern 

        - Input matrix of 'n x n'
        - Print matrix in snake pattern.
        
        Input:
        
        matrix [4][4] = { {10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}
                        }
        
        Output: (Snake Pattern)
        10 20 30 40 45 35 25 15 27 29 37 48 27 29 37 48 50 39 33 32
        
*/

import java.util.Scanner;  // import Scanner class
import java.util.ArrayList;  // import ArrayList class 

class Snake{
    //method to return ArrayList of matrix in Snake pattern 
    // [return_type]   [method] 
    ArrayList<Integer> print(int mat[][]){
        // declaring ArrayList of Integers
        ArrayList<Integer>res=new ArrayList<Integer>(mat.length*mat.length);
        
        // iterating for rows 
        for(int r=0;r<mat.length;r++){
            if(r%2==0){   //even numbered row 
                for(int c=0;c<mat.length;c++){    // iterating for columns 
                    res.add(mat[r][c]);  //adding elements to ArrayList 
                }
            } 
            else{   //odd numbered row 
                for(int c=mat.length-1;c>=0;c--){  // iterating for columns
                    res.add(mat[r][c]);   // adding elements to ArrayList
                }
            }
            
        } //for loop ends 
        return res;   
    }
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  // creating Scanner object
        int n=inp.nextInt();   // input length of matrix
        int mat[][]=new int[n][n];   // declare matrix of array 
        
        // input matrix
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                mat[r][c]=inp.nextInt();
            }    
        }
        
        Snake obj=new Snake();  // creating obj of class 'Snake'
        System.out.println(obj.print(mat));  // invoking method associated to obj
    }
}
