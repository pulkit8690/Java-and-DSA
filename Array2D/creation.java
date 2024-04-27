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
