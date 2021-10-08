/* Creating an immuatable class :
        - Objects value cannot be modified, if so, a new object is created.
        - All methods of wrapper class/immutable classes are created using this method.
*/


//creating a 'final' class so that it can't be over written :
final class Test{
    
    private int i;  //creating a private instance variable | private means that no other class or objects can access that variable
    
    //creating Constructor :
    Test(int i){
        this.i=i;     //giving this objects'i instance value 'i' (from argument)
    }
    
    //creating an method trying to overwrite the instance variable of class/object
    public Test modify(int i){      //takes int value as argument | return type is 'Test' | 'public' can be accessed from any other class
        if(this.i==i){    //if argument value is equal to this object's value no change, return the this object 
            return this; //return this object only
        }
        else{    //if argument value is not same as this object's
            return new Test(i);   //return a new object created with new constructor argument             
        }
    }
    
}//class ends
