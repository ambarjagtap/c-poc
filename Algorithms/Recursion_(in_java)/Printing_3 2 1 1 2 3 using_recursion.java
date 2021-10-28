// Print '3 2 1 1 2 3' using recursion 


import java.util.Scanner;

class MyClass{
    
    static void print(int n){
        if(n<1){
            return;
        }
        
        else{
            System.out.print(n+" ");
            print(n-1);
            System.out.print(n+" ");
        }
        
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        
        print(n);
    }
}
