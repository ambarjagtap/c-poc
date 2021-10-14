// Java program to find and count number of prime pairs with difference of '6' in a given range[n,m] 


import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;  //for iteration purpose


class MyClass{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int m=inp.nextInt();
        
        System.out.println(new Solution().count(n,m));
    }
}



class Solution{
    int cnt=0;
    static boolean check(int num){
        int i;
        for(i=2;i<num;i++){
            if(num%i==0)break;
        }
        if(i==num)return true;
        return false;
    }
    
    String count(int n,int m){
        
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(int i=n;i<=m;i++){
            if(check(i)){
                ls.add(i);        
            }
        }
        Collections.sort(ls);
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<ls.size();i++){
            for(int j=i+1;j<ls.size();j++){
                if(Math.abs(ls.get(i)-ls.get(j))==6){
                    cnt++;
                    map.put(ls.get(i),ls.get(j));
                }
            }
        }
        
        if(cnt==0)return "No Prime Pairs";
        else {
            for(Map.Entry<Integer,Integer>it:map.entrySet()){
                System.out.println(it.getKey()+" "+it.getValue());
            }
            return String.valueOf(cnt);
        }
    }
}
