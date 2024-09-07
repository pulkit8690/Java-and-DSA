//https://www.naukri.com/code360/problems/minimum-path-sum_985349?

public class MinimumPathSum_Rec {
    public static int Min_Sum(int m,int n,int grid[][])
    {
        if(m==0 && n==0) return grid[m][n];
        if(m<0 || n<0) return (int) 1e9;
        int up= grid[m][n] + Min_Sum(m-1, n, grid);
        int left=grid[m][n] +Min_Sum(m, n-1, grid);
        return Math.min(up, left);
    }
    public static void main(String[] args) {
        int grid[][]={{1,2,3},{4,5,4},{7,5,9}};
        int m=grid.length;
        int n=grid[0].length;
        System.out.println(Min_Sum(m-1,n-1,grid));
    }
}
