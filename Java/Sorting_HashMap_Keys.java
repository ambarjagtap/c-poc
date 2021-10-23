/* Sorting elements of a HashMap 
    - Put all data of a HashMap is a TreeMap.
    - The map is sorted according to natural ordering of keys.
    
*/

import java.util.*;

class SortMapKey{
    
    // globally declare Map 
    // Only one copy is available which is accessible to all functions
    static HashMap<String,Integer>m=new HashMap<String,Integer>();
    
    
    public static void sortbykey(){
        
        //creating a TreeMap to store values of HashMap 
        TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
        
        //put all data of HashMap into TreeMap
        tm.putAll(m);
        
        //Displaying data of TreeMap
        for(Map.Entry<String,Integer>it:tm.entrySet()){
            System.out.println(it.getKey()+" "+it.getValue());
        }
        
    }
    
    public static void main(String[] args){
        m.put("ffnsodj",45);
        m.put("incd",57);
        m.put("sfdjww",78);
        m.put("adfor",96);
        
        sortbykey();  //invoking function to sort 
    }
    
}
