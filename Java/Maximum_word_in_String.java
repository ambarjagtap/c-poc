// Java program to print largest word in a String :

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        System.out.println(new Solution().largest_word(str));
    }
}

class Solution{
    String largest_word(String str){
        String arr[]=str.split(" ");
        int max=0,ind=0;
        
        for(int i=0;i<arr.length;i++){
            int curr=arr[i].length();
            if(curr>max){
                max=curr;
                ind=i;
            }
        }
        return arr[ind];
    }
}
