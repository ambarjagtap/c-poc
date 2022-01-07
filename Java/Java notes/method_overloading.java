/*
JAVA program to understand concept of "Method Overloading" :
*/

//creating a new class named "Bill" : 
class Bill{
    
    //methods | m1 :
    public double findPrice(int itemId){    //public  means can be called from other classes as well
        switch(itemId){
            case 1001 : return 25; 
            
            case 1002 : return 20; 
                
            case 1003 : return 23; 
                
            case 1004 : return 18; 
                
            default : return 0; 
        }
    }
    
    
    // overloading above method : using three different types of constructors
    public double findPrice(String brand_name,String item_type,int size){
          
        if(brand_name.equals("Puma")){
            if(item_type.equals("T-shirt")){
                switch(size){
                    case 34: return 25; 
                    case 36: return 25;
                    default: return 0;
                }
            }
            else if(item_type.equals("Skirt")){
                switch(size){
                    case 38: return 20;
                    case 40: return 20;
                    default : return 0;
                }
            }
            else return 0;
        }
        else if(brand_name.equals("Reebok")){
            if(item_type.equals("T-shirt")){
                switch(size){
                    case 34: return 23;
                    case 36: return 23;
                    default: return 0;
                }
            }
            else if(item_type.equals("Skirt")){
                switch(size){
                    case 38: return 18;
                    case 40: return 18;
                    default : return 0;
                }
            }
            else return 0;
        }
        else return 0;
    }
    

}


//Tester class
class Tester{
    //main method 
    public static void main(String[] args){
        //creating an obj of class Bill 
        Bill bill=new Bill();
        double price=bill.findPrice(1001);  //invoking method of obj "findPrice" and 
                                            // storing the returned value in "price"
                                            // not the overloaded one 
                                            
    
        if(price>0){
            System.out.println("Price of selected item is $"+price);
        } 
        else System.out.println("The values are not valid");
        
        
        //invoking the overloaded method 
        price=bill.findPrice("Reebok","T-shirt",34);   //invoking the overloaded method 
        if(price>0){
            System.out.println("Price of selected item is $"+price);
        }        
        else System.out.println("The values are not valid");
    }
    
}
