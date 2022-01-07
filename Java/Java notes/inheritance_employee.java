/*
  "this" keyword refers to fields and methods refering to the same class.
 */


//importing Scanner class 
import java.util.Scanner; 

//create Employee class: 
class Employee{
    
    //fields/members of employee class  
    protected int emp_id;
    protected String emp_name;
    protected double salary=0.00;
    
  
    //constructor of employee 
    Employee(int new_emp_id,String new_emp_name){
        
        this.emp_id=new_emp_id;  //set emp_id  
        this.emp_name=new_emp_name;  //set emp_name
        
    }
    
    //get emp id :   
    public int get_employee_id(){
        return this.emp_id;
    }
    
    //set emp id :
    public void set_employee_id(int new_emp_id){
        this.emp_id=new_emp_id;
    }
    
    //get emp_name : 
    public String get_employee_name(){
        return this.emp_name;
    }
    
    //set emp name :
    public void set_employee_name(String new_emp_name){
        this.emp_name=new_emp_name;
    }
    
    //get salary :
    public double get_employee_salary(){
        return this.salary;
    }
    
    //set salary :
    public void set_employee_salary(double new_emp_salary){
        this.salary=new_emp_salary;    
    }
    
    
} //----------------------------------------------------------------------


//PermanentEmployee extends Employee
class PermanentEmployee extends Employee{
    
    // field/members :
    private double basic_pay;
    private double hra;
    private float experience;
    
    //constructor : ~~(------------parameters of class PermanentEmployee------------------------------------)
    PermanentEmployee(int new_emp_id,String new_name,double new_basic_pay,double new_hra,float new_experience){
        super(new_emp_id,new_name);  //setting fields/members
        this.basic_pay=new_basic_pay;  //setting this class members :
        this.hra=new_hra;  
        this.experience=new_experience;
    }
    
    //methods : method 1
    public void calculateMonthlySalary(){     //calculatingMonthlySalary :
        this.salary=this.basic_pay+this.hra+this.get_var_pay(experience);    //setting salary of this class(NOTE: salary field is inherited)
    }
    
    //method 2
    private double get_var_pay(float experience){
        if(experience<3)return 0;
        else if(experience>=3 && experience<5){
            return (double)((5*this.basic_pay)/100);
        }
        else if(experience>=5 && experience<10){
            return (double)((7*this.basic_pay)/100);
        }
        else{
            return (double)((12*this.basic_pay)/100);
        }
    }
    
    
    //getting basic pay 
    public double get_basic_pay(){
        return this.basic_pay;
    }
    
    //setting basic pay 
    public void set_basic_pay(double new_basic_pay){
        this.basic_pay=new_basic_pay;
    }   
    
    //getting hra 
    public double get_hra(){
        return this.hra;
    }
    
    //setting hra 
    public void set_hra(double new_hra){
        this.hra=new_hra;
    }
    
    //getting experience 
    public float get_experience(){
        return this.experience;    
    }
   
    //setting experience 
    public void set_experience(float new_experience){
        this.experience=new_experience;
    }
    
}


//"extends" is a keyword to inherit from super/parent class 
class ContractEmployee extends Employee {
    
    //members/fields  
    private double wage;
    private float hoursWorked;
    
    //constructor 
    ContractEmployee(int new_emp_id,String new_name,double new_wage,float new_hoursWorked){
        super(new_emp_id,new_name);  //constructor for super class
        this.wage=new_wage;
        this.hoursWorked=new_hoursWorked;
    }
    
    //method : m1: 
    public void calculateSalary(){
        this.salary=this.wage*this.hoursWorked;
    }
    
    //getting wage 
    public double get_wage(){
        return this.wage;
    }
    
    //setting wage 
    public void set_wage(double new_wage){
        this.wage=new_wage;
    }
    
    //getting hoursWorked 
    public float get_hoursWorked(){
        return this.hoursWorked;
    }
    
    //setting hoursWorked 
    public void set_hoursWorked(float new_hoursWorked){
        this.hoursWorked=new_hoursWorked;
    }
}


//Tester class 
class Tester{
    //main method :
    public static void main(String[] args){
     
        PermanentEmployee pe1=new PermanentEmployee(711211,"Rafael",1850.00,115.00,3.5f);  //creating new obj of class PermanentEmployee using constructors 
        pe1.calculateMonthlySalary();  //invoking method of pe1 obj 
        System.out.println("Hi "+pe1.get_employee_name()+", your salary is $"+pe1.get_employee_salary());
        
        //creating obj of ContractEmployee class 
        ContractEmployee ce1=new ContractEmployee(102,"Jennifer",16,90);   //creating new 
        ce1.calculateSalary();
        System.out.println("Hi "+ce1.get_employee_name()+", your salary is $"+ce1.get_employee_salary());
        
    }
}

