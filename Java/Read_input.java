// Program to read input from user 

//Import Scanner class utility 
import java.util.Scanner;

class Read_input{
    public static void main(String[] args){
        
        //create a Scanner Object || where 'new' allocates memory dynamically in RAM for obj.
        Scanner obj=new Scanner(System.in);   // Specifying 'new' keyword which datatype/class to allocate 
                                              // memory to 
                                              
        
        //Declaring a string and taking string input
        String str=obj.nextLine();
        
        //Declaring an int and taking integer input
        int a = obj.nextInt();
        
        //Declaring double and taking decimal input
        double salary=obj.nextDouble();
        
        //Print the output
        System.out.println("string str is :"+str);
        System.out.println("int a = "+a);
        System.out.println("double salary = "+salary);
    }
}
