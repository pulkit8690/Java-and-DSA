// TC:O(m*n)    SC: O(m*n) + O(m+n)
//https://www.naukri.com/code360/problems/total-unique-paths_1081470
import java.util.Arrays;

public class TotalUniquePath_Memo {
    public static int UniquePath(int m,int n,int dp[][])
    {
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int up= UniquePath(m-1, n, dp);
        int left=UniquePath(m, n-1, dp);
        dp[m][n]=up+left;
        return dp[m][n];
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int dp[][]= new int[m+1][n+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(UniquePath(m-1,n-1,dp));
    }
}
