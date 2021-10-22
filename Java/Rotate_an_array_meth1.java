
// Java program to rotate an array cyclically leaving the first element :


import java.util.Scanner;


class MyClass{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //declare Scanner obj 
        
        int n=inp.nextInt();  //input array size 
        
        int arr[]=new int[n];   //declare an array 
        
        for(int i=0;i<n;i++)arr[i]=inp.nextInt();   //input all elements of array 

        int k=inp.nextInt();   //input key(size of rotation)
        
        int res[]=new int[n];   //create a new array (result)
        
        
        //iterating from last element to first 
        for(int i=n-1;i>=0;i--){ 
            if(i==0)res[i]=arr[i];  //first element to remain same 
            else{
                if((i+k)>arr.length-1){  //if element's index+k > array.length-1 
                    res[(i+k)-(arr.length-1)]=arr[i];  //insert at right position 
                }
                else{
                    res[i+k]=arr[i];  //insert at right position 
                }
            }
        }

        //print the final array 
        for(int i=0;i<res.length;i++)System.out.print(res[i]+" ");
    
        
    }
}
