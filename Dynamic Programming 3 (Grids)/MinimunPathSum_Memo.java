////https://www.naukri.com/code360/problems/minimum-path-sum_985349?
import java.util.Arrays;

public class MinimunPathSum_Memo {
    public static int Min_Sum(int m, int n, int grid[][], int dp[][])
    {
        if(m==0 && n==0 ) return grid[0][0];
        if(m<0 || n<0) return (int)1e9;
        if(dp[m][n]!=-1) return dp[m][n];
        int up= grid[m][n] + Min_Sum(m-1, n, grid, dp);
        int left= grid[m][n] + Min_Sum(m, n-1, grid, dp);
        dp[m][n]=Math.min(up, left);
        return dp[m][n];
    }
    public static void main(String[] args) {
        int grid[][]={{1,2,3},{4,5,4},{7,5,9}};
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]= new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(Min_Sum(m-1,n-1,grid,dp));
    }
}
