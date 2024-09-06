
public class UniquePath2_Tabu {
    public static int UniquePath(int m,int n, int mat[][])
    {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==-1) dp[i][j]=0;
                else if(i==0 && j==0) dp[i][j]=1;
                else{
                    int up=0,left=0;
                    if(i>0) up= dp[i-1][j];
                    if(j>0) left= dp[i][j-1];
                    dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int mat[][]={{0,0,0},{0,-1,0},{0,0,0}};
        int m=mat.length;
        int n=mat[0].length;
        System.out.println(UniquePath(m,n,mat));
    }
}
