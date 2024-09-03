public class FrogJump_Tabu {
    public static int fun(int n, int ht[])
    {
        if(n==0) return 0;
        int dp[]= new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            int left=dp[i-1]+Math.abs(ht[i-1]-ht[i]);
            int right=Integer.MAX_VALUE;
            if(i>1)
            {
                right=dp[i-2]+Math.abs(ht[i-2]-ht[i]);
            }
            dp[i]=Math.min(left, right);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=3;
        int heights[]={10,20,30,10};
        System.out.println(fun(n,heights));
    }
}
