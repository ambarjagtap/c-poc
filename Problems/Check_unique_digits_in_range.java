/*
    Java program to count unique digit numbers between given range.
*/


import java.util.Scanner;
import java.util.ArrayList;

class MyClass{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int m=inp.nextInt();
        
        System.out.println(new Solution().count(n,m));
    }
}

class Solution{
    
    static boolean check(int num){
        ArrayList<Integer>ls=new ArrayList<Integer>();
        
        while(num>0){
            ls.add(num%10);
            num=num/10;
        }
        
        for(int i=0;i<ls.size();i++){
            for(int j=0;j<ls.size();j++){
                if(ls.get(i)==ls.get(j)&&i!=j)return false;
            }
        }
        return true;
    }
    
    int count(int n,int m){
        int cnt=0;
        for(int i=n;i<=m;i++){
            if(check(i))cnt++;
        }
        return cnt;
    }
    
}
