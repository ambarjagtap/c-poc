/* converting 'Digit to base 17' to 'decimal' using HashMaps 
    
    PROBLEM:
    - Given a maximum of four digits to the base 17 [10=A, 11=B, 12=C, 13=D.......16=G].
    - Input as a string and output decimal value.
    
    Eg: Input: 1A 
        Output: 27
      
        Input: 23GF
        Output: 10980
*/

// importing util package
import java.util.*;  
// java.lang package is by default imported


// create main class 
class Main{
    
    // main method 
    public static void main(String[] args){
        
        // create an Hash map of <Character,Integer> and allocate it dynamically.
        // Here, Character is 'key' and Integer is 'value'.
        // Key is always unique.
        HashMap<Character,Integer>new_map=new HashMap<Character,Integer>();
        
        
        // insert elements in the map accordingly using keyword 'put' 
        new_map.put('A',10);
        new_map.put('B',11);
        new_map.put('C',12);
        new_map.put('D',13);
        new_map.put('E',14);
        new_map.put('F',15);
        new_map.put('G',16);
        new_map.put('a',10);
        new_map.put('b',11);
        new_map.put('c',12);
        new_map.put('d',13);
        new_map.put('e',14);
        new_map.put('f',15);
        new_map.put('g',16);

        
        Scanner inp=new Scanner(System.in);
        
        String str=inp.nextLine();
        
        int len=str.length();
        len--;
        
        long dec=0;
        int val=0;
        
        
        for(int i=0;i<str.length();i++){
            
            //if it is a character, fetch its value from map || use map.get()
            if(str.charAt(i)>='a' && str.charAt(i)<='g' || str.charAt(i)>='A' && str.charAt(i)<='G'){
                dec+=new_map.get(str.charAt(i))*Math.pow(17,len);
                len--; //used for power
            }
                
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                dec+=(str.charAt(i)-48)*Math.pow(17,len);
                len--; // used for power 
            }
        
        }
        System.out.println(dec);
                
    }
    
}
    
