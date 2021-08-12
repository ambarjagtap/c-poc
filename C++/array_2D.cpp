/* Program to input elements in a 2D array and output */

#include<iostream>

int main(){
    int i,j;        // i for outer loop (row) 
    int arr[3][3];  // arr[row][column]

    std::cout<<"Enter elements :"<<std::endl;
    
    //nested for loop to take element into matrices
    for(i=0;i<3;i++){   //for loop for changing rows
        for(j=0;j<3;j++){    //for loop for changing columns
            std::cin>>arr[i][j];
        }
        
    }

    //nested for loop to print elements of matrices
    for(i=0;i<3;i++){    // for loop to enter a row
        for(j=0;j<3;j++){       // for loop to print elements of column
            std::cout<<arr[i][j];
        }
        std::cout<<std::endl;
        
    }

    return 0;
}

