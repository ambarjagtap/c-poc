/*
    Add leading zeros to an integer 
    
    Useful function : System.out.print'f'("%03d OR %02d OR %d", int);
    
*/

import java.util.*;
// java.lang is by default included 

class Main{
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        
        int low=inp.nextInt();
        int up=inp.nextInt();
        
        for(int i=low;i<=up;i++){
            
            if(up>=100)
                System.out.printf("%03d ",i);
            else if(up>=10)
                System.out.printf("%02d ",i);
            else System.out.printf("%d ",i);
            
        }
        
    }
}
