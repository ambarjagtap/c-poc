
import java.util.Scanner;

class Main{
    // method to change case 
	  static char out(char ch){
    	if(Character.isUpperCase(ch)){
        	return Character.toLowerCase(ch);
        }
    	else 
          return Character.toUpperCase(ch);
    }
  
    // main method 
  	public static void main(String[] args){
    	  Scanner inp=new Scanner(System.in);   // create Scanner input 
      	char ch=inp.next().charAt(0);   // input char 
      	
      	System.out.println(out(ch));  //invoke method 
    }

}
