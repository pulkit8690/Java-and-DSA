//https://atcoder.jp/contests/dp/tasks/dp_b
import java.util.Arrays;

public class FrogJump2_Tabu {
    public static int fun(int n,int k, int ht[])
    {
        int dp[]= new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j <= k; j++) 
            {
                if (i - j >= 0) 
                {
                    dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(ht[i] - ht[i - j]));
                }
            }
        }
        return dp[n-1];

    }
    public static void main(String[] args)
    {
        int n=5;
        int k=3;
        int ht[]={10,30,40,50,20};
        System.out.println(fun(n,k,ht));
    }
}
