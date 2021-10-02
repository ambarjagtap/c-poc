/*
    Problem statement:

        - You are required to implement the following function:
            char* FrequentCharacterReplaced(char*' str, char x); 

        - The function accepts a string 'str' and a character 'x' as its arguments. 
          You are required to find the most frequent character in string 'str' and replace it with character 'x' 
          across the string, and return the same. 

        Note: 
        - If the frequency of two characters are the same, we have to consider the character with lower ascii value. 



    Input:
        bbadbbababb 

    Output: 
        ttadttatatt 



    Explanation:    
        The most frequent character in string 'str' is 'b', replacing 'b' with 't' will form string 'ttadttatatt', 
        hence 'ttadttatatt' is returned.

_________________________________________________________________________________________________________________________*/

//import Scanner class 
import java.util.Scanner;

//main class 
class Main{
    //main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();  //input String 
        char ch=inp.next().charAt(0);  //input char to replace with 
        System.out.println(new Solution().FrequentCharacterReplaced(str,ch));  //invoke function by creating an object without var
        
    }
}


//class Solution 
class Solution{
    //method to find max_char and replace it 
    String FrequentCharacterReplaced(String str,char ch){
        char arr[]=str.toCharArray();  //String to array 
        int max_cnt=0;  //for maximum count 
        char max_char='\0';    //for storing maximum appearing character 
        
        //loop to find maximum repeating char 
        for(int i=0;i<arr.length;i++){  //iterating over array 
            int curr_cnt=0;  //set initial counter to zero 
            for(int j=0;j<arr.length;j++){   
                if(arr[i]==arr[j] && i!=j)
                    curr_cnt++;   //increase counter 
            }
            if(curr_cnt>max_cnt){
                max_cnt=curr_cnt;
                max_char=arr[i];
            }    
        }    
        
        //replacing char 
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max_char)arr[i]=ch;
        }
        
        return new String(arr);   //returning String 
        
    }
}

