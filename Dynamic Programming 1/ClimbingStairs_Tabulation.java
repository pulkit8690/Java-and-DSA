

public class ClimbingStairs_Tabulation {
    public static int countWays(int n)
    {
        int dp[]= new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-2]+dp[i-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(countWays(n));
    }
}
