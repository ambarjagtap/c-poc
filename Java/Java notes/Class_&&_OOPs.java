// Java program to demonstrate use of class and objects in OOPs :
// Also an example of 'Encapsulation'


//creating a new class 
// This class is just a blueprint/design of an real world object
class Bicycle{
    
    // data members
    int cadence=0;
    int speed=0;
    int gear=1;
    

    // methods to access these data members 
    // 1. change cadence
    void change_cadence(int newvalue){
        cadence=newvalue;
    }
    
    // 2. change gear || NOTE: Gear should be between 1-6
    void change_gear(int newvalue){
        if(newvalue>=1 && newvalue<=6)gear=newvalue;
        else System.out.println("Wrong input");
    }
    
    // 3. speed up  || NOTE: Displahy warning if Speed>40 
    void speed_up(int increment){
        speed=speed+increment;
        if(speed>40)System.out.println("Speed exceeds limit");      
    }
    
    // 4. stop vehicle 
    void stop(){
        speed=0;
    }
    
    // 5. display state 
    void display(){
        System.out.println("cadence="+cadence+" speed="+speed+" gear="+gear);
    }

}


// creating instances using another class 
class BicycleDemo{
    
    // main method 
    public static void main(String[] args){
        
        //creating objects of class 'Bicycle' 
        Bicycle bike1=new Bicycle(); // creating an object of class 'Bicycle'
        Bicycle bike2=new Bicycle(); // creating an object of class 'Bicycle'
        
        //invoking methods for 'bike1'
        bike1.change_gear(5);
        bike1.change_gear(0);
        bike1.change_cadence(50);
        bike1.speed_up(50);
        
        // invoking methods for object 'bike2'
        bike2.change_gear(1);
        bike2.change_cadence(65);
        bike2.speed_up(20);
        bike2.speed_up(21);
        
        // display states of two bikes
        bike1.display();
        bike2.display();
        
    }
    
}  // class ends 
