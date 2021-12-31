/*______________________________________________________________________

  Java program to demonstrate "Aggregation" :


 "ASSOCIATION" is a relation between two classes implemented using objects.
 "COMPOSITION and AGGREGATION are two forms of ASSOCIATION".
 
 _________________________________________________
 [ASSOCIATION]---> [AGGREGATION]---> [COMPOSITION]
 _________________________________________________
 
 
 
 
 Aggregation is a process in which one class implements object 
 of another class. 

________________________________________________________________________*/


import java.util.*;  //importing all classes of util package


//creating a class Player 
class Player{
    
    //member variables   
    //private: accessible within the class only, not other class/sub-classes
    private int pl_id;  //player id
    private String pl_name;  //player name 
    private int pl_health;   //player health 
    private Weapon pl_weapon;  // 'pl_weapon' is an object of Weapon class, it is used in this class (aggregation)
    
    //------------------------------------------------------
    
    //Constructor (non-parameterised) 
    Player(int new_id,String new_name,int new_health,Weapon new_weapon){
        this.pl_id=new_id;
        this.pl_name=new_name;
        this.pl_health=new_health;
        this.pl_weapon=new_weapon;
    }
    
    //member functions 
    public void display(){
        System.out.println(this.pl_id+" "+this.pl_name+" "+this.pl_health+" "+this.pl_weapon.w_name+" "+this.pl_weapon.w_type);
    }
    
}


//creating a class weapon 
class Weapon{
    
    //member variables 
    public String w_name;  //public : can be accessed by any class 
    public String w_type;
    
    //constructor of class Weapon  // by default invoked 
    Weapon(){  //void return type //same name as class 
        this.w_name="knife";
        this.w_type="tool";
    } 
    
}


//---------------------------------------------------------------------------------------------------
//class for testing another classes 
class Tester{
    //main method 
    public static void main(String[] args){
        
        Weapon w_p1=new Weapon();  //creating obj of Weapon class
        Player p1=new Player(1203060,"Ambar",100,w_p1);  //creating a new obj of type Player, and intialising it using parameters.
        p1.display(); //invoking member func. of obj of type Player 
    }
    
}   
