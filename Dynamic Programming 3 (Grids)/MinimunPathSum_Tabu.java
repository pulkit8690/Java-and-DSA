//https://www.naukri.com/code360/problems/minimum-path-sum_985349?
public class MinimunPathSum_Tabu {
    public static int Min_Sum(int m,int n, int grid[][])
    {
        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0) dp[i][j]=grid[i][j];
                else{
                    int up=0,left=0;
                    if(i>0) up=grid[i][j]+dp[i-1][j];
                    else up = (int) 1e9;
                    if(j>0) left=grid[i][j]+dp[i][j-1];
                    else left = (int) 1e9;
                    dp[i][j]=Math.min(up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int grid[][]={{1,2,3},{4,5,4},{7,5,9}};
        int m=grid.length;
        int n=grid[0].length;
        System.out.println(Min_Sum(m,n,grid));
    }
}
