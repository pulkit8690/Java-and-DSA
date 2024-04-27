package Array2D;

import java.util.Scanner;

public class max_min {
    public static void print(int mat[][])
    {
        System.out.println("2D Array is: ");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                System.out.print(mat[i][j]+" ");;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Coloums: ");
        int m = sc.nextInt();
        int matrix[][]=new int [n][m];
        //int n= matrix.length; // Number of Rows
        //int m= matrix[0].length;// Number of Coloum
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter ["+i+","+j+"] element: ");
                matrix[i][j]=sc.nextInt();
            }
        }
        print(matrix);
    }
}

