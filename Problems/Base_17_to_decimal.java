/* PROBLEM:
    - Given a maximum of four digits to the base 17 [10=A, 11=B, 12=C, 13=D.......16=G].
    - Input as a string and output decimal value.
    
    Eg: Input: 1A 
        Output: 27
      
        Input: 23GF
        Output: 10980

___________________________________________________________________________________________________________*/


import java.util.Scanner;
// java.lang by default imported 

class Solution{
    
    public static void main(String[] args){
        
        Scanner inp=new Scanner(System.in);
        
        String str=inp.nextLine();
        
        char arr[]=str.toCharArray();
        
        long decimal=0;
        
        int val=0;
        
        int len=arr.length;
        len--;//used for power
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>='0' && arr[i]<='9')val=arr[i]-48; 
            
            if(arr[i]>='a' && arr[i]<='g')val=arr[i]-97+10;
            
            if(arr[i]>='A' && arr[i]<='G')val=arr[i]-65+10;
            
            decimal+=val*(Math.pow(17,len));
            len--;
            
        }
        System.out.println(decimal);
    }
}

