//  Java program to add two large digit numbers 


import java.util.Scanner;


class Add{
    String add(String str1,String str2){        // method to add two large digit numbers
        
        // str1 < str2 , assign str2 to str2 
        if(str1.length()<str2.length()){    // method to swap two large numbers
            String temp=new String(str1);
            str1=str2;
            str2=temp;
        }
        
        // difference of lengths                // carry=0
        int diff=str1.length()-str2.length();  int carry=0;
        String res="";  // for result 
        int i;  
        for(i=str1.length()-1;i>=diff;i--){      // iterate from last element of large num to first element of small num
            
                int sum=((int)str1.charAt(i)-48)+((int)str2.charAt(i-diff)-48)+carry;       // adding sum + carry 
            
                if(sum<10){   // if sum is less than 10
                    carry=0;   // set carry = 0 , again 
                    res+=(char)(sum+48);   // append to string by type casting to char 
                }
                else {
                    carry=sum/10;
                    res+=(char)((sum%10)+48);
                }
        }
        for(int j=i;j>=0;j--){    // iterating for remaining large string from middle to first 
            int sum=((int)str1.charAt(j)-48)+carry;  // addition 
            if(sum<10){
                res+=(char)(sum+48);    
                carry=0;  //set carry to 0
            }
            else{
                carry=sum/10;
                res+=(char)((sum%10)+48);
            }
        }
        
        if(carry>0)res+=(char)(carry+48);   // adding rest of carry 
        return new StringBuilder(res).reverse().toString();     // creating a new StringBuilder from 'res' , reversing it and converting it to String 
    }
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String str1=inp.nextLine();
        String str2=inp.nextLine();
        
        Add obj=new Add();
        System.out.println(obj.add(str1,str2)); 
        
    }
}
