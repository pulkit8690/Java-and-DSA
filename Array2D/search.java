package Array2D;

import java.util.Scanner;

public class search {
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
    public static boolean search_key(int mat[][],int key)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==key)
                {
                    System.out.println(key+" is found at ["+i+","+j+"]");
                    return true;
                }
            }
        }
        System.out.println(key+" is not present in Array");
        return false;
    }
    public static void main(String[] args) {
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
        System.out.print("Enter Number you want to Search in Array: ");
        int key=sc.nextInt();
        search_key(matrix, key);
        
        
    }
}
