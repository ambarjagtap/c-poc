/*

Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:



Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.

*/



import java.util.Scanner;


class Tester{
    
    public static void main(String[] args){
        
        Scanner inp=new Scanner(System.in);
        
        char ch=inp.next().charAt(0);
        int qnt=inp.nextInt();
        int dis=inp.nextInt();
        
        
        if(ch=='V'){
            if(dis<=3){
                int amnt=12*qnt;
                System.out.println(amnt);
            }   
            else if(dis>3 && dis<=6){
                int amnt=(12*qnt)+(dis-3);
                System.out.println(amnt);
            }
            else{
                int amnt=(12*qnt)+(3+((dis-6)*2));
                System.out.println(amnt);
            }
        }
        
        else if(ch=='N'){
            if(dis<=3){
                int amnt=15*qnt;
                System.out.println(amnt);
            }   
            else if(dis>3 && dis<=6){
                int amnt=(15*qnt)+(dis-3);
                System.out.println(amnt);
            }
            else{
                int amnt=(15*qnt)+(3+((dis-6)*2));
                System.out.println(amnt);
            }
        }
        
        
    }
}
