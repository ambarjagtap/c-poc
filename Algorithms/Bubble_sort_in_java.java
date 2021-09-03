/* Java program to implement Bubble sort 
    *O(n^2)
*/


// import Scanner class from java.util package
import java.util.Scanner;


// Creating a class
class Bubble_sort{
    
    //method to print array
    static void print_array(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
    //sorting method
    void sort(int arr[],int n){
        int i,j;
        
        //no. of iterations always one less than size
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){     // '-i' because in each iteration one element gets placed at last place.
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }            
        }
        
        //print the sorted array || invoke print method without any object, as only one copy is available 
        // to all objects.
        print_array(arr,n);
    }
    
    
    //main method
    public static void main(String[] args){
        
        //creating a Scanner Object
        Scanner obj=new Scanner(System.in);
        
        //input array size by invoking nextInt method of obj
        int n=obj.nextInt();
        
        //declaring array of size 'n'
        int arr[]=new int[n];
        
        //input array
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        
        //invoke sort method with an Object of class Bubble sort
        Bubble_sort ob=new Bubble_sort();
        ob.sort(arr,n);
        
    }    
}

