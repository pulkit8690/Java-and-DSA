import java.util.Arrays;

public class Jump1_Memoization {
    public static boolean canJump(int arr[])
    {
        int n=arr.length-1;
        int dp[]=new int[arr.length];
        Arrays.fill(dp, -1);
        return helper(arr,0,n,dp)==1;
    }
    public static int helper(int arr[],int i, int n, int dp[])
    {
        if(i==n) return 1;
        if(arr[i]==0 || i>n ) return 0;
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        for(int j=1;j<=arr[i];j++)
        {
            if(helper(arr, i+j, n, dp)==1)
            {
                return dp[i]=1;
            }
        }
        return dp[i]=0;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
