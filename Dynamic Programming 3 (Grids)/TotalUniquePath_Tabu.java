//TC: O(m*n)    SC: O(m*n)
//https://www.naukri.com/code360/problems/total-unique-paths_1081470
public class TotalUniquePath_Tabu {
    public static int UniquePath(int m,int n)
    {
        int dp[][]= new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0) dp[i][j]=1;
                else{
                    int up=0,left=0;
                    if(i>0) up=dp[i-1][j];
                    if(j>0) left=dp[i][j-1];
                    dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int m=3,n=3;
        System.out.println(UniquePath(m,n));
    }
}
