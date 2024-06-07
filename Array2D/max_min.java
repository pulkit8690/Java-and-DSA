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
    public static void MaxMat(int mat[][])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]>max)
                {
                    max=mat[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void MinMat(int mat[][])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]<min)
                {
                    min=mat[i][j];
                }
            }
        }
        System.out.println(min);
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
        System.out.print("Maximum value is: ");
        MaxMat(matrix);
        System.out.print("Minimum value is: ");
        MinMat(matrix);
        sc.close();
    }
}

