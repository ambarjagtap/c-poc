/* Cost of painting a property:
    Interior wall painting cost : 18 rs/sq ft
    Exterior wall painting cost : 12 rs/sq ft 
    
    - Estimate cost of painting a property.
    - input number of interior walls.
    - Input number of exterior walls.
    - Input surface area of each interior wall.
    - Input surface area of each exterior wall.
    - Output 'cost'.
    
    Sample input : 
    6 // number of interior walls 
    3 // number of exterior walls 
    12.3  
    15.2
    12.3
    15.2  
    12.3
    15.2  
    10.10  
    10.10
    10.00

    Sample output: 1847.4
    
*/


// import Scanner class 
import java.util.Scanner;

// create a class 
class Solution{
    
    // main method 
    public static void main(String[] args){
        
        // create a Scanner object 
        Scanner inp=new Scanner(System.in);
        
        //input number of interior/exterior walls 
        int num_in=inp.nextInt();
        int num_ext=inp.nextInt();
        
        //declaring two arrays of type 'double'
        double arr_in[]=new double[num_in];
        double arr_ext[]=new double[num_ext];
        
        //total areas two type of walls 
        double area_in=0;
        double area_ext=0;
        
        //input area of interior walls and exterior walls while adding them 
        for(int i=0;i<num_in;i++){
            arr_in[i]=inp.nextDouble();
            area_in+=arr_in[i];
        }
        
        for(int i=0;i<num_ext;i++){
            arr_ext[i]=inp.nextDouble();
            area_ext+=arr_ext[i];
        }
        
        // cost 
        double cost=(area_in*18)+(area_ext*12);
        
        //print answer 
        System.out.println(cost);
    }
    
}


    
