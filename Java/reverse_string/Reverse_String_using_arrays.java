// Java program to reverse String using arrays 

import java.util.Scanner;

// create main class
class Main{
    
    //method 2 to reverse a String 
    static String reverse_meth2(String str2){
        char arr[]=str2.toCharArray();   //create an char array by using a String 
        int l=0,r=arr.length-1;  //set int 'l' and 'r'
        
        //swap elements 
        while(l<=r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String res=new String(arr);   //create a String using char array 
        return res;   //return String 
    }
    
    //method 1 to reverse a String 
    static String reverse(String str){
        char arr[]=str.toCharArray();  //create an array using String 
        String res="";   //create an empty String 
        for(int i=arr.length-1;i>=0;i--){      //traverse the array from the end to start 
            res+=arr[i];
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  // creating Scanner object
        String str=inp.nextLine();   //take input string 1
        String str2=inp.nextLine();   //take input string 2
        
        System.out.println(reverse(str));  //reverse string using method 1
        System.out.println(reverse_meth2(str2));    //reverse string using method 2
    }
}
