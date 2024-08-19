
// Using Memoization
public class Fibonacci {
    public static int Fibo(int n, int dp[])
    {
        if(n==1||n==0)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        dp[n] =Fibo(n-1, dp) +Fibo(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int dp[]= new int[n+1];
        System.out.println(Fibo(n,dp));
    }
}
