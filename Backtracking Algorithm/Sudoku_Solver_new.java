public class Sudoku_Solver_new {
    public static boolean solveSudoku(int grid[][])
    {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int k=1;k<=9;k++)
                    {
                        if(isValid(grid, i, j, k))
                        {
                            grid[i][j]=k;
                            if(solveSudoku(grid)==true)
                            {
                                return true;
                            }
                            else{
                                grid[i][j]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(int grid[][], int row, int col, int k)
    {
        for(int i=0;i<9;i++)
        {
            if(grid[i][col]==k)
            {
                return false;
            }
            if(grid[row][i]==k)
            {
                return false;
            }
            if (grid[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == k)

            {
                return false;
            }
        }
        return true;
    }
    public static void printSudoku(int grid[][])
    {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};
        if(solveSudoku(sudoku))
        {
            System.out.println("Solution Exists");
            printSudoku(sudoku);
        }
        else
        {
            System.out.println("Solution DOES NOT Exists");
        }
    }
}
