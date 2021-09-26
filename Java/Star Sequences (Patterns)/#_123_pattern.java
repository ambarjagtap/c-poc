/*---------------------------------------------------------  
  Input: 5
  Output:  
  1
  ##
  234
  ####
  56789
---------------------------------------------------------*/

import java.util.Scanner;

class Solution{
    public static void print(int n){
        int i=1;
        for(int r=0;r<n;r++){
            if(r%2==0){
                for(int c=0;c<=r;c++){
                    System.out.print(i);
                    i++;
                }
            }
            else{
                for(int c=0;c<=r;c++){
                    System.out.print("#");
                }
            }
            System.out.print("\n");
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        Solution obj=new Solution();
        obj.print(n);
    }
}
