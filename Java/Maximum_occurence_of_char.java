 // Java program to count occurence of each character in a String 

 
import java.util.Scanner;   //import Scanner class 
import java.util.HashMap;    //import HashMap
import java.util.Map;      //import Map class for iterating HashMap 
import java.util.Collections;    //import Collections framework to find max values  


//creating a class 
class MyClass{
    // main method 
     public static void main(String[] args){
        Scanner inp=new Scanner(System.in);   //creating Scanner obj 
        String str=inp.nextLine();   //taking String input 
        char ch=inp.next().charAt(0);   //taking char input  
        
        
        //Creating a HashMap of <Character,Integer> 
        HashMap<Character,Integer>m=new HashMap<Character,Integer>();
        
        //iterating each char of String 
        for(int i=0;i<str.length();i++){
            //if char is already present, increase its count 
            if(m.containsKey(str.charAt(i)))m.put(str.charAt(i),m.get(str.charAt(i))+1);
            //else insert the element 
            else{
                m.put(str.charAt(i),1);
            }
        }
        
        //printing occurence of char 'ch'
        System.out.println(ch+" "+m.get(ch));
        
        //create a char obj
        char max_char='\0';
        int max_val=Collections.max(m.values());   //getting max value from the HashMap
        
        //iterating HashMap and getting key with max value 
        for(Map.Entry<Character,Integer>it:m.entrySet()){
            if(it.getValue()==max_val){  
                max_char=it.getKey();
            }
        }
        
        System.out.println("Maximum occuring char : "+max_char+" "+max_val+" times");
        
    }
}
