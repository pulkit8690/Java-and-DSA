/*
 Time Complexity- O(n!)
 T(n)= 1QueenPlace * T(n-1) + isSafe()
     = n*T(n-1)  + isSafe()
 */

import java.util.Scanner;

public class nqueen {
    public static void PrintBoard(char board[][])
    {
        System.out.println("------- Chess Board -------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row, int col)
    {
        // Vertically Up
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            {
                return false;
            }
        }

        // Up Left Diagnol
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }

        // Up Right Diagnol
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void NQueen(char board[][],int row)
    {
        //Base Case
        if(row==board.length)
        {
            PrintBoard(board);
            count++;
            return;
        }
        //Recursion
        
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
            board[row][j]='Q';
            NQueen(board, row+1); // Function Call
            board[row][j]='x'; // Backtracking Step
            }
            
        }
    }
    static int count=0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n =sc.nextInt();
        sc.close();
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='x';
            }
        }
        NQueen(board,0);
        System.out.println("Total Number of Solution: "+count);

    }
}
