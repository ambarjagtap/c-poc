// Java program to print all palindromes of inside a String 


import java.util.Scanner;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str=inp.nextLine();
        ArrayList<String>ls=new Solution().palindrome(str);
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}


class Solution{
    ArrayList palindrome(String str){
        
        ArrayList<String>ls=new ArrayList<String>();
        
        char arr[]=str.toCharArray();
        for(int l=0;l<arr.length-1;l++){
            for(int r=arr.length-1;r>l;r--){
                if(Character.compare(arr[l],arr[r])==0){
                    int temp_l=l,temp_r=r;
                    while(temp_l<temp_r){
                        if(Character.compare(arr[temp_l],arr[temp_r])!=0)break;
                        temp_l++;
                        temp_r--;
                    }
                    if(temp_l>=temp_r){
                        String temp="";
                        for(int i=l;i<=r;i++){
                            temp+=arr[i];
                        }
                        ls.add(temp);
                    }
                }
            }
        }
        return ls;
        
        
    }
}
