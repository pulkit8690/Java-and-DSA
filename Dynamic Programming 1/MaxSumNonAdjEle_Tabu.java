//https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261
public class MaxSumNonAdjEle_Tabu {
    public static int MaxSum(int arr[], int n)
    {
        int dp[]= new int[n+1];
        dp[0]=arr[0];
        for(int i=1;i<=n;i++)
        {
            int pick= arr[i];
            if(i>1) pick+=dp[i-2];
            int not_pick=dp[i-1];
            dp[i]=Math.max(pick, not_pick);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,5,8,1,9};
        int n=arr.length;
        System.out.println(MaxSum(arr,n-1));
    }
}
