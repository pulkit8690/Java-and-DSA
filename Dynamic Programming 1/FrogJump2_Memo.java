//https://atcoder.jp/contests/dp/tasks/dp_b
import java.util.Arrays;

public class FrogJump2_Memo {
    public static int fun(int n, int k, int ht[], int dp[])
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int minSteps=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++)
        {
            if(n-j>=0)
            {
                int steps=fun(n-j, k, ht, dp)+Math.abs(ht[n-j]-ht[n]);
                minSteps=Math.min(minSteps,steps);
            }
        }
        dp[n]=minSteps;
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int ht[]={10,30,40,50,20};
        int dp[]= new int[n];
        Arrays.fill(dp, -1);
        System.out.println(fun(n-1,k,ht,dp));
    }
}
