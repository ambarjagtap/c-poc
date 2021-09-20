/*
    PROBLEM:
        -Given an String in lowercase.
        -Letters can be duplicate or non-duplicate.
        -Duplicate letters have multiple copies, but non-duplicate letters are present only once.
        -Return the index of the first non-duplicate letter if we traverse from left to right,
         else return '-1'.
        -use indexing from '1'.
        
    /*--Solution using HashMap--*/
    /*--functions used :
        1. map.containsKey(key_name);  // returns true if found 
        2. map.put(key_name,value);  // insert elements into map 
        3. map.get(key_name);   // gets value corresponding to key_name  
        
    
        /*---for--iterators---
        
        1. it.getKey();  // get key associated to 'iterator'
        2. it.getValue();  // get value associated to 'iterator'
        
        ----------------------*/
        
*/


import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;  // for HashMap iteration

public class Main{
    
    public int getUniqueLetter(String str){
        // create an HashMap of character and integer which will map char to its count 
        HashMap<Character,Integer>map1=new HashMap<Character,Integer>(); 
        
        //  iterate over all chars of string 
        for(int i=0;i<str.length();i++){
            // if char is already present, increment value by '1'
            if(map1.containsKey(str.charAt(i))) // means that char occurs again
                map1.put(str.charAt(i),map1.get(str.charAt(i))+1);  // increase count by 1 
                
            else { // if new char then 
                map1.put(str.charAt(i),1);
            }
            
        } // for loop ends 
        
        char ch=str.charAt(0);
        boolean found=false;
        
        //iterating entire map1 
        for(Map.Entry<Character,Integer>it:map1.entrySet()){
            // =1 means that element occurs only once 
            if(it.getValue()==1){  // if char is occurring once 
                ch=it.getKey();  // get key associated 
                found=true;
                break;
            }
        }
        if(found){
            return str.indexOf(ch)+1;  // (returns index of the character ) +1; 
        }
        else return -1;
        
    } // method ends 
    
    
    public static void main(String[] args){
        // create Scanner obj
        Scanner inp=new Scanner(System.in);
        
        // input String         
        String str=inp.nextLine();
        
        // create obj of Main class 
        Main obj=new Main();
        int res=obj.getUniqueLetter(str);  // invoke method of obj 
        
        if(res==-1){  // if res is '-1'
            System.out.println("No such element");
            return;
        }
        else System.out.println(res);
        
    }
}
