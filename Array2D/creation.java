/*
*************** 2D Array in Memory **************
There are 2 ways that 2D array are stored in matrix :
    1. Row Major: Each Row is Stored as Seperate array with continous memory location
                    1 2 3           [1 2 3] , [4 5 6], [7 8 9] are seperate arrays 
                    4 5 6           Element     Memory Location
                    7 8 9           1           1000
                                    2           1004
                                    3           1008
                                    4           1012
                                    5           1016
                                    -            -
                                    -            -
                                    9           1032
    
    2. Coloum Major: Each Coloum is Stored as Seperate array with continous memory location
                    1 2 3           [1 4 7] , [2 5 8], [3 6 9] are seperate arrays 
                    4 5 6           Element     Memory Location
                    7 8 9           1           1000
                                    4           1004
                                    7           1008
                                    2           1012
                                    5           1016
                                    -            -
                                    -            -
                                    9           1032               
 */

/*
 2D Array in Memory in Java

 All is same above but arrays are not necessary to have continous location
         ie in Row Major [1 2 3] , [4 5 6], [7 8 9] have no relations in thier memory
         Element     Memory Location
        1           1000
        2           1004
        3           1008
        
        4           2000
        5           2004
        -            -
        -            -
        9           3008
 */


package Array2D;

import java.util.Scanner;

public class creation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int matrix[][]=new int [3][3];
        int n= matrix.length; // Number of Rows
        int m= matrix[0].length;// Number of Coloum
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter ["+i+","+j+"] element: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D Array is: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");;
            }
            System.out.println();
        }
        
    }
}
