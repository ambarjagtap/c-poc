/*
    Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9. 
*/


import java.util.Scanner;
import java.util.ArrayList;

class MyClass{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int tc=Integer.parseInt(inp.nextLine());
        
        while(tc!=0){
            String str=inp.nextLine();
            ArrayList<String>ls=new Solution().find(str);
            if(ls.size()==0)System.out.println("-1");
            else {
                for(int i=0;i<ls.size();i++){
                    System.out.print(ls.get(i)+" ");
                }
            }
            tc--;
        }
    
    }
}

class Solution{
    ArrayList find(String str){
        String arr[]=str.split(" ");
        ArrayList<String>ls=new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int it=0;it<arr[i].length();it++){
                if(arr[i].charAt(it)<'0'||arr[i].charAt(it)>'8'){flag=false;break;}
            }
            if(flag==true)ls.add(arr[i]);
        }
        
        return ls;
    }
}
