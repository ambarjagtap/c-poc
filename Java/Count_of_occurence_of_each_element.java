// Java program to print occurence of each element of ArrayList using HashMap 


import java.util.Scanner;  //input Scanner class 
import java.util.ArrayList;  //input ArrayList 
import java.util.HashMap;   //input HashMap 
import java.util.Map;  //input Map class iteration purpose 


//creating Solution class 
class Solution{
    
    //creating global static HashMap 
    static HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
    
    //function to find occurence of each element 
    //take input 'ArrayList'
    static void find_occurence(ArrayList<Integer>ls){
        for(int i=0;i<ls.size();i++){  //iterating each element of ArrayList 
            if(m.containsKey(ls.get(i))){  //if element is already present 
                m.put(ls.get(i),m.get(ls.get(i))+1); //increase count 
            }
            else{
                m.put(ls.get(i),1);  //put element in HashMap
            }
        }
    }
    
    //function to print HashMap 
    static void print_map(){
        for(Map.Entry<Integer,Integer>it:m.entrySet()){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
    
    
    //Main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in); //creating Scanner obj 
        ArrayList<Integer>ls=new ArrayList<Integer>(); //creating ArrayList 
        
        //taking dynamic input of integers
        while(inp.hasNextInt()){
            ls.add(inp.nextInt());
        }
        
        find_occurence(ls); //function to find occerence 
        print_map();  //printing HashMap
    }
}
