/*
    PROBLEM:
        -The binary system only two digits '0' and '1'.
        -Implement function :
            int OperationsBinaryString(char *str);
        
        -The function accepts String str as a argument.
        -The String consists of binary digits separated by an alphabet.
            -A denotes AND 
            -B denotes OR 
            -C denotes XOR 
        
        -Calculate the String scanning from left to right 
        -return '-1' is String is 'null'.
*/

/*------------------------------------------------------------------------------------------------------------*/

//import Scanner class
import java.util.Scanner;

//create main class
class Main{
    
    //method to calculate binary operations     
    static int OperationsBinaryString(String str){
        if(str==null||str.length()==0)return -1;  //if String is null, return -1   
        
        //store integer value in res 
        int res=(int)str.charAt(0)-48;
        
        //iterate String from index '1' to last, incrementing i by '2', every time 
        for(int i=1;i<str.length();i+=2){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=67){   //if the character is between 'A' and 'C'
                if((int)str.charAt(i)==65){             //if 'A'
                    res=res & (int)str.charAt(i+1)-48;     // use the '&/AND' operator 
                }
                else if((int)str.charAt(i)==66){        //if 'B'
                    res=res | (int)str.charAt(i+1)-48;      //use the '|/OR' operator 
                }
                else{                                   //if 'C'
                    res=res ^ (int)str.charAt(i+1)-48;      //use the '^/XOR'
                }
            
            }
        }
        return res;   //return the result 
    }   
    
    //main method 
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);   //create Scanner object 
        String str=inp.nextLine();     //input a String 
        System.out.println(OperationsBinaryString(str));    //invoke method by giving String as an argument 
    }
}

