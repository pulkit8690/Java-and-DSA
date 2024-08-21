

public class Kanpsack01_Memoization {
    public static void PrintDp(int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int KnapSack(int val[],int w[], int W,int n, int dp[][])
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }
        if(w[n-1]<=W)
        {
            int ans1=val[n-1]+KnapSack(val, w, W-w[n-1], n-1, dp);// Include
            int ans2=KnapSack(val, w, W, n-1, dp);
            dp[n][W]=Math.max(ans1, ans2);
            return dp[n][W];
        }else{
            dp[n][W]=KnapSack(val, w, W, n-1, dp);
            return dp[n][W];
        }
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int w[]={2,5,1,3,4};
        int W=7;
        int dp[][]= new int[val.length+1][W+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(KnapSack(val,w,W,val.length,dp));
        PrintDp(dp);
    }
}
