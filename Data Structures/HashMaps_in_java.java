/*------------------------------------------------------------------------------------------------------
  HashMaps :

    - Data structures which store data in a tabular form consisting of two columns which are 'key'
      and 'value'.
    - 'key' refers to indexing of values and they are always unique.
    - 'values' can repeat themselves.
    - constant time 'insertion' and 'retrieval'.
    - Syntax:
        - "HashMap<Character,Integer>map=new HashMap<Character,Integer>();"
    - It is inside "java.util" package ("java.util.HashMap;").
    - There should be only one NULL key object.
    - Hashing is a technique to convert large strings into small strings for better search. 
--------------------------------------------------------------------------------------------------------    
    - Factors affecting performance:
      - capacity: Number of buckets. (by default: 16)
      - load factor: Measure that decides when to increase the capacity of map as to keep the time
                     complexity as 'constant time'. (By default: 0.75f OR 75% of map size)
                     Eg: For a size of 16 and load factor 0.75f , =75% X 16 =12th index.
      - threshold: product of 'initial capacity' and 'load factor'.
      
      - Rehashing: It is the process of doubling the size of map after it reaches threshold.          
-------------------------------------------------------------------------------------------------------

    HIERARCHY:
                         [MAP]  //interface 
                           ^
                           |
                           |  
                           |
                  -----implememts-----
                           |
                           |
                           |
                      [ABSTRACT MAP]
                           |
                           |
                       [HASH MAP] extends [ABSTRACT MAP]
                           |
                           |
                    [LINKED HASH MAP] extends [HASH MAP]                    
                         
--------------------------------------------------------------------------------------------------------
  IMPLEMENTATION: 
    - HashMaps are implemented using 'Linked Lists'.
    
--------------------------------------------------------------------------------------------------------
*/

// Java program to demonstrate use of "HashMap"

import java.util.HashMap;  // importing HashMap class 
import java.util.Map;   // used for traversal

class Demo{ // main class 
    
    // main method 
    public static void main(String[] args){
        
        //creating an HashMap using generics 
        //'Generics' are entities like class,interfaces,methods that operate on parameterised types.
        HashMap<String,Integer>map=new HashMap<String,Integer>();
        // default size: 16
        // default load factor: 0.75
        
        //adding elements using 'put' method 
        map.put("vffv",52);
        map.put("vdsghr",569);
        map.put("ubie",29);
        map.put("oeuhx",941);
        map.put("nadi",954);
        
        // printing size of map 
        System.out.println(map.size());
        
        // printing map 
        System.out.println(map);
        
        // checking if a key is present or not 
        // if present, then getting value of that key 
        if(map.containsKey("nadi")){
            
            //storing value of that key 
            int val=map.get("nadi");
            
            // output value of that key 
            System.out.println(val);
        }
        
    /*--------------------------*/System.out.println("\n");/*---------------------------------------*/
        
        // creating HashMap by specifying intial capacity of '3' and load factor '0.5f' :
        HashMap<Character,Integer>map2=new HashMap<Character,Integer>(3,0.5f);   //HashMap of size '2'
        // which means that when index is 1.5, size will double.
        
        //inserting elements 
        map2.put('d',4);
        map2.put('f',9);
        map2.put('j',2);
        
        //removing an element 
        map2.remove('f');
        
        // printing size of map 
        System.out.println(map2.size());
        
        //printing map 
        System.out.println(map2);
        
    /*-----------------------------*/System.out.println("\n");/*-------------------------------------*/

        // iterating each element of Map using in-built iterator 
        /*------for 'map'------*/
        
        for(Map.Entry<String,Integer>it: map.entrySet()) 
            System.out.println(it.getKey()+" "+it.getValue());
     
        
        /*-----iterating for map2-------*/ System.out.println("\n");
        
        for(Map.Entry<Character,Integer>it:map2.entrySet())
            System.out.println(it.getKey()+" "+it.getValue());
        
    }
    
}
