/*
    String Pairs | TCS Codevita 2020 |
    Difficulty Level : Medium
    
    One person hands over the list of digits to Mr. String, But Mr. String understands only strings. 
    Within strings also he understands only vowels. 
    Mr. String needs your help to find the total number of pairs which add up to a certain digit D.

    The rules to calculate digit D are as follows:

        - Take all digits and convert them into their textual representation.
        - Next, sum up the number of vowels i.e. {a, e, i, o, u} from all textual representation. 
          This sum is digit D.
        - Now, once digit D is known find out all unordered pairs of numbers in input whose sum is equal to D.
        

    Problem Statement: Given an array arr[] consisting of N ( 1 ≤ N ≤ 100 ) integers, the task is to convert 
    each array element ( 1 ≤ arr[i] ≤ 100 ) into their respective textual representations and print the 
    lowercase representation of the count of all possible pairs from the array whose sum is equal to the 
    total count of vowels present in their textual representation. If the count exceeds 100 print greater 100.
    Note: For the number 100, convert it to textual representation as hundred and not as one hundred.
    
    Examples:
    Input: arr[] = {1, 2, 3, 4, 5}
    Output: one
    
    Explanation:
    1 -> one -> o, e (2 vowels)
    2 -> two -> o (1 vowel)
    3 -> three -> e, e (2 vowels)
    4 -> four -> o, u (2 vowels)
    5 -> five – > i, e (2 vowels)
    
    The total count of vowels in their textual representations = {2 + 1 + 2 + 2 + 2} = 9.
    Now from the given array, only a single unordered pair {4, 5} sums up to 9. Therefore, the count is 1. 
    Hence, the required output is “one“.

    Input: arr[] = {7, 4, 2, }
    Output: zero
    Explanation:
    7 -> seven -> e, e (2 vowels)
    4 -> four -> o, u (2 vowels)
    2 -> two -> o (1 vowel)
    The total count of vowels in their textual representation = {2 + 2 + 1} = 5.
    Now from the given array, no pair exists which adds up to 5. Therefore, the answer is “zero“


________________________________________________________________________________________________________*/



import java.util.Map;   //class for traversing Map   
import java.util.Scanner;   //class for Scanner obj 
import java.util.HashMap;  //class for HashMap

// main class 
class Main{
    // main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);  //for input 
        String str=inp.nextLine();  //taking String input 
        System.out.println(new Solution().find_pair(str));  //create obj of class 
    }
}


//class for Solution 
class Solution{
    
    // method to return no of vowels 
    static int check_vowel(String str){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                cnt++;
            }
        }
        return cnt;
    }
    
    //method to find No of pairs 
    String find_pair(String str){
        String arr[]=str.split(" ");  //spilt the string by " ", into String array 
        int num_arr[]=new int[arr.length]; 
        for(int i=0;i<arr.length;i++)num_arr[i]=Integer.parseInt(arr[i]);  //creating num arrays 
        
        //creating HashMap of (Integer,String)
        HashMap<Integer,String>map=new HashMap<Integer,String>();
        //creating map by putting values 
        map.put(0,"zero");   
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"size");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        
        
        int no_vow=0;
        for(int i=0;i<num_arr.length;i++){  //for each element of num_arr get String associated 
            String temp=map.get(i);  //fetch String from map by using no. 
            no_vow+=check_vowel(temp);  //store no of vowels
        }
        
        int ord=0;
        for(int i=0;i<num_arr.length;i++){
            for(int j=0;j<num_arr.length;j++){
                if((num_arr[i]+num_arr[j]==no_vow)&& i!=j)ord++;
            }
        }
        
        String res="";
        for(Map.Entry<Integer,String>it:map.entrySet()){
            if(ord==it.getKey()){
                res=it.getValue();
                break;
            }
        }
        
        return res;
    }
}

