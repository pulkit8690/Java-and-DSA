

public class Kanpsack01_Tabulation {
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
    public static int KnapSack(int[] val, int[] wt, int W)
    {
        int n=val.length;
        int dp[][]= new int[n+1][W+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++)
        {
            dp[0][j]=0;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<W+1;j++)
            {
                int w=wt[i-1];
                int v=val[i-1];
                if(w<=j)
                {
                    int incProfit=v+dp[i-1][j-w];
                    int exProfit=dp[i-1][j];
                    dp[i][j]=Math.max(incProfit, exProfit);
                }else{
                    int exProfit=dp[i-1][j];
                    dp[i][j]=exProfit;
                }
            }
        }
        PrintDp(dp);
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(KnapSack(val,wt,W));
    }
}
