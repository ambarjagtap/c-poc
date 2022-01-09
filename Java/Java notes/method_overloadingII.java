//importing Scanner class 
import java.util.Scanner;


//creating a class named Point 
class Point{
    
    //members/fields 
    private double x;
    private double y;
    
    //constructor 
    Point(double new_x,double new_y){
        this.x=new_x;
        this.y=new_y;
    }
    
    //methods :
    //method 1: between origin and this point
    public double calculateDistance(){
        double dis=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        return Math.round(dis*100.0)/100.0;
    }
    
    //method 2: between this point and point passed as parameter 
    public double calculateDistance(Point new_p){
        double dis=Math.sqrt(Math.pow(new_p.x-this.x,2)+Math.pow(new_p.y-this.y,2));
        return Math.round(dis*100.0)/100.0;
    }
    
    
    //setters and getters
    //getting x-coordinate 
    public double getxCoordinate(){
        return this.x;
    }
    
    //setting x-coordinate 
    public void setxCoordinate(double new_x){
        this.x=new_x;
    }
    
    //getting y-coordinate 
    public double getyCoordinate(){
        return this.y;    
    }
    
    //setting y-coordinate 
    public void setyCoordinate(double new_y){
        this.y=new_y;    
    }
    
}

//tester class :-
class Tester{
    public static void main(String[] args){
        Point point1=new Point(3.5,1.5);  //creating obj using constructor 
        Point point2=new Point(6,4);  //creatinf obj using constructor
        
        System.out.println(String.format("Distance of point1 from origin is "+point1.calculateDistance()));
        System.out.println(String.format("Distance of point2 from origin is "+point2.calculateDistance()));
        System.out.println(String.format("Distance of point1 from point2 is "+point1.calculateDistance(point2)));
        
    }
    
}
