/* 
    Program to add two numbers same digits, of digits greater than 5.
*/


import java.util.*;
// java.lang is by default imported 


class Add{
    
    // method to add num1 and num2, having return type 'String'
    String add(String num1,String num2){
        String res="";  // res to store addition 
        int sum=0,carry=0;  // set initial sum & carry to '0'
    
        // iterate numbers from last index to first index
        for(int i=num1.length()-1;i>=0;i--){
            
            //calculate sum +carry               
            sum=(((int)num1.charAt(i)-48) + ((int)num2.charAt(i)-48)+carry);
            
            // sum < 10
            if(sum<10){
                carry=0; // set carry to zero 
                res+=(char)(sum+48);  // store in char format 
            }
            else{  // sum > 10 
                carry=sum/10;  // carry next int 
                res+=(char)((sum%10)+48);  // store in char format   
            }
        }
        res+=(char)(carry+48);  // append last carry to num 
        
        /*----------------------------------------------------------------
            STEP 1 : Create a new String 'resf'
            STEP 2 : Create a new StringBuilder via String 'res' 
                     to reverse that string and convert it back to String.
        -------------------------------------------------------------------*/
        
        //              new class(via 'res').reverse().toString();
        String resf=new StringBuilder(res).reverse().toString();
        
        return resf; // return result String 
        
    } // method ends 
    
    
    /*-----------------------Main method-------------------------------------*/
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in); // creating Scanner object 
        
        String num1=inp.nextLine();  //input num1 
        String num2=inp.nextLine();  // input num2
        
        // if number of digits is not same 
        if(num1.length()!=num2.length()){
            System.out.print("Please enter equal number of digits.");
            return;
        }
        
        System.out.print("  ");
        for(int i=0;i<num1.length();i++){    // printing num1 
            System.out.print(num1.charAt(i));
        }
        System.out.print("\n"+"+ ");
        for(int i=0;i<num2.length();i++){   // printing num2
            System.out.print(num2.charAt(i));
        }
        System.out.print("\n"+"________________________________________________________________________________"+"\n"+"=");
        
        
        Add obj=new Add();
        System.out.print(obj.add(num1,num2));
    }
}
