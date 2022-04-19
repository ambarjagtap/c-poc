/*
Java program to demostrate use of lambda functions using a calculator program :

*/

import java.util.Scanner;


class Test{
    
    //creating a functional interface :
    interface FuncInter1{
        //abstract method :
        double operation(double a,double b);
    }
    
    //method to operate :
    private double operate(double a,double b, FuncInter1 fobj){
        return fobj.operation(a,b);
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        double x=inp.nextDouble();
        double y=inp.nextDouble();
        
        //creating and defining lambda expressions : 
        FuncInter1 add=(double a,double b)->a+b;
        FuncInter1 subtract=(double a,double b)->a-b;
        FuncInter1 multiply=(double a,double b)->a*b;
        FuncInter1 divide=(double a,double b)->a/b;
        
        Test testobj=new Test();
        
        //calling lambda expressions : 
        System.out.println(testobj.operate(x,y,add));
        System.out.println(testobj.operate(x,y,subtract));
        System.out.println(testobj.operate(x,y,multiply));
        System.out.println(testobj.operate(x,y,divide));
        
    }
}

