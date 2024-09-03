import java.util.Arrays;

public class FrogJump_Memo {
    public static int fun(int n, int ht[], int dp[])
    {
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int left= fun(n-1,ht,dp)+Math.abs(ht[n]-ht[n-1]);
        int right= Integer.MAX_VALUE;
        if(n>1)
        {
            right= fun(n-2,ht,dp)+Math.abs(ht[n]-ht[n-2]);
        }
        dp[n]= Math.min(right,left);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        int heights[]={10,20,30,10};
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fun(n,heights,dp));
    }
}
