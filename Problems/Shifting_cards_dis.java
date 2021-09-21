/*------------------------------------------------------------------------------------------------------------------------------
    PROBLEM: 
        -You are playing a card game where 'n' cards of different colours are arranged in a circular list.
        -The player must move one card at a time, either to 'Left' or 'Right'.
        -If the last card is reached, the next card is at the other end of the list.
        
    GIVEN:
        -You are given with one 'card colour' and 'one card index'.
        -Identify the minimum number of moves from left or right, required to reach the given 'card colour'.
        
    CONSTRAINTS:
        - 1 <= n >= 100
        - 0 <= startInd <= n-1
        - 1 <= cards[i] & target card <= 100

 ------------------------------------------------------------------------------------------------------------------------------
 
    EXAMPLE:
        - Input:                                            
            4        //-------no. of cards 
            ["red","blue","green","yellow"]     //-----cards name 
            1               //-------starting index 
            "yellow"    //----reaching card  
          
          Output:
            2   // minimum no of moves from left or right 
    
    EXAMPLE:
        - Input:
            5      //-------input no of cards 
            ["black","grey","brown","red","pink"]         //-------cards name
            3      //------starting index 
            "black"     //--------reaching index 
            
        - Output:
            2     // minimum no of moves from left or right 
            
_______________________________________________________________________________________________________________________________*/



import java.util.*;
// java.lang is by default imported

// create class 
class Cards{
    
    // method to find min distance 
    //                  nameofmethod(ListofString, startindex,     String to find)
    public static int shiftCards(List<String>cards,int start_index,String target){
        int end_index=cards.indexOf(target); // find index of String to find
        
        int forward=0,backward=0;  // to find distance  
        
        if(end_index==start_index)return 0;  // if the same index and same String to find 
        
        if(Math.abs(start_index-end_index)==1)return 1;  // if distance is only '1'
        
                                     /*Example*/
                                     //   s   e 
        if(start_index<end_index){   // 0 1 2 3 4      // if start is less than end  
            forward=end_index-start_index;   
            backward=start_index+(cards.size()-1-end_index)+1;  // '+1' for '0' to lastindex 
        }
                                      //   e   s
        if(start_index>end_index){    // 0 1 2 3 4 
            backward=start_index-end_index;
            forward=(cards.size()-1-start_index)+1+end_index;
        }
        
        return Math.min(forward,backward);   // return minimum of (forward,backward)
    
    }
    
    
    // main method 
    public static void main(String[] args){
        
        // declare array of String
        String tools[]={"black","grey","brown","red","pink"};

        // declare array list of type String        
        ArrayList<String>l=new ArrayList<>();
    
        // add all elements of arr 'tools' to ArrayList 'l',
        Collections.addAll(l,tools);   
        
        int start=3;  // index to start from 
        String target="black";   // String/index to find for 
        
        // output min distance from forward/backward 
        System.out.println(shiftCards(l,start,target));
                                //````^````^`````^`````
                             // ArrayList,start,StringToFind
    
    }
}


