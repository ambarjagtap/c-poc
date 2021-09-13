/*
  Interface :
    - In common language interface can be described as a link between an object and outside world.
      Eg. Object in a class interact with other objects through methods that they expose.
    - In java, interface is 'group of related methods, but with empty bodies' and 'no impletation'.
    - Its like a design template of 'related methods' which we can include in our program. 
*/

// A simple java program to demostrate 'interfaces' :


// creating an interface for 'Bicycle'
interface Bicycle{   // collection of related methods
  
  // methods related to bicycle :
  //NOTE: There is not implementation.
  void cadence(int newvalue);
  void change_gear(int newvalue);
  void speed_up(int increment);
  void apply_brake();

} // interface ends 

// NOTE: This class must use all methods inside interface 'Bicycle'
// Keyword 'implements' is used for interface 
class ABCcycles implements Bicycle{
  
  // data members
  int cadence=0;
  int speed=0;
  int gear=0;
  
  // now implementing all methods (MANDATORY)
  // All methods must be 'PUBLIC'
  public void cadence(int newval){
      cadence=newval;
  }
  public void speed_up(int newval){
      speed+=newval;
  }
  public void change_gear(int newval){
      gear=newval;
  }
  public void apply_brake(){
      speed=0;
  }
  
}
