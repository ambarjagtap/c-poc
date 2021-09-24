// Java program to find LCM of three numbers 

import java.util.Scanner;


class Main{
    
    int find_LCM(int num1,int num2,int num3){
        int lcm=Math.max(Math.max(num1,num2),num3);
        while(true){
            if(lcm%num1==0&&lcm%num2==0&&lcm%num3==0){
                return lcm;
            }
            lcm++;
        }
    }
    
    
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int num1=inp.nextInt();
        int num2=inp.nextInt();
        int num3=inp.nextInt();
        
        Main obj=new Main();
        System.out.println(obj.find_LCM(num1,num2,num3));
    }
}
