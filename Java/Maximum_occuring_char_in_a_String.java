// Java program to find frequency of each character in a String and find maximum occuring character. 


import java.util.Scanner; //importing Scanner class 
import java.util.HashMap; //importing HashMap class 
import java.util.Map; //importing Map class for iteration purpose 

//creating new class 
class Solution{
    
    // creating static obj of HashMap, called without creating an object , one copy only 
    static HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
    
    //function to find frequency of each char 
    static void find_frequency(String str){
        for(int i=0;i<str.length();i++){   //iterate all elements 
            if(hm.containsKey(str.charAt(i))){   //if element is already present in HashMap 
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);  //increase count by 1 
            }
            else{   //if not present in HashMap 
                hm.put(str.charAt(i),1);
            }
        }
    }
    
    // function to print HashMap 
    static void print_map(){
        for(Map.Entry<Character,Integer>it:hm.entrySet()){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
    
    //function to find max occuring character 
    static void print_max(){
        int max_cnt=0; char max_char='\0';
        for(Map.Entry<Character,Integer>it:hm.entrySet()){
            if(it.getValue()>max_cnt){
                max_cnt=it.getValue();  //update count 
                max_char=it.getKey();   //update max char 
            }
        }
        System.out.println("Maximum occuring character : "+max_char+"-"+max_cnt+" times.");
    }
    
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //creating Scanner obj 
        String str=inp.nextLine();   //taking String input 
        
        find_frequency(str);   //calling function to find frequency 
        print_map();  //calling function to print HashMap 
        print_max();  //calling function to find max occuring char 
    }
    
}

