/* Saga of missing coin :
    
    A teacher has a large box which contains coins and number is printed on them.
    Before coming to class she ensured all coins occur even number of times.
    While entering class, one coin fell down and got lost.
    Find the number on missing coin.
    
    Input : number of coins and then coins separated by spaces.
    Output: number on missing coin.
    
    Sample input: 8
                  5 7 2 7 5 2 5
    
    Sample output:5
    

_____________________________________________________________________________________________________
*/


// import Scanner Object
import java.util.Scanner;

// create a class
class Solution{
    
    // function to find number of count of each element in an array 
    // and finding if its even or not 
    int find_element(int arr[],int size){
        int cnt=0,curr;
        
        for(int i=0;i<size;i++){
            curr=arr[i];
            cnt=1;    
            for(int j=0;j<size;j++){
                if(arr[j]==curr && j!=i){
                    cnt++;
                }
            }
            if(cnt%2!=0)return curr;
        }
        return 0;
    } // func ends
    
    
    // main method 
    public static void main(String[] args){
        
        //creating Scanner object 
        Scanner inp=new Scanner(System.in);
        
        //input size of array 
        int size=inp.nextInt();
        size--; //decrement size because one coin is lost 
        //declare array of size 
        int arr[]=new int[size];
        
        // input elements into array 
        for(int i=0;i<size;i++)arr[i]=inp.nextInt();
        
        // invoke find element method 
        Solution obj1=new Solution();
        System.out.println(obj1.find_element(arr,size));
        
    }
}
    
