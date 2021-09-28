// Java program to print sorted non redundant occurences of an array 

import java.util.Scanner;

class Myclass{
    static void inc_sort(int arr[]){
        //bubble sort 
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    

    static void rem_dup(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[j]==arr[i])break;
            }
            if(j==i)System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        
        inc_sort(arr);
        rem_dup(arr);
    }
}
