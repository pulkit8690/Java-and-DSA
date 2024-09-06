import java.util.Arrays;

public class UniquePath2_Memo {
    public static int UniquePath(int m, int n, int mat[][], int dp[][])
    {
        if(m==0 && n==0) return mat[0][0]==0 ? 1 :0;
        if(m<0 || n<0) return 0;
        if(mat[m][n]==-1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        int up= UniquePath(m-1, n, mat, dp);
        int left=UniquePath(m, n-1, mat, dp);
        dp[m][n]=up+left;
        return dp[m][n];
    }
    public static void main(String[] args) {
        int mat[][]={{0,0,0},{0,-1,0},{0,0,0}};
        int m=mat.length;
        int n=mat[0].length;
        int dp[][]= new int[m][n];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(UniquePath(m-1,n-1,mat,dp));
    }
}
