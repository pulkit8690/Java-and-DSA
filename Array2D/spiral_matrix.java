package Array2D;

import java.util.Scanner;

public class spiral_matrix {
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
    public static void spiral(int mat[][])
    {
        int start_row=0;
        int start_col=0;
        int end_row= mat.length-1;
        int end_col= mat[0].length-1;
        while(start_row<=end_row && start_col<=end_col)
        {
            // Top
            for(int j=0;j<=end_col;j++)
            {
                System.out.print(mat[start_row][j]+" ");
            }
            // right
            for(int i=start_row+1;i<=end_row;i++)
            {
                System.out.print(mat[i][end_col]+" ");
            }
            // bottom
            for(int j=end_col-1;j>=start_col;j--)
            {
                if(start_col==end_col)
                {
                    break;
                }
                System.out.print(mat[end_row][j]+" ");
            }
            // left
            for(int i=end_row-1;i>=start_row+1;i--)
            {
                if(start_row==end_row)
                {
                    break;
                }
                System.out.print(mat[i][start_col]+" ");
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
        System.out.println();
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
        System.out.print("Spiral Matrix is :");
        spiral(matrix);
        sc.close();
    }
    
}
