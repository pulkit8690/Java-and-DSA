//https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261

import java.util.Arrays;

public class MaxSumNonAdjEle_Memo {
    public static int MaxSum(int arr[], int n, int dp[])
    {
        if(n==0) return arr[0];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=arr[n]+MaxSum(arr, n-2, dp);
        int not_pick= MaxSum(arr, n-1, dp);
        dp[n]= Math.max(pick, not_pick);
        return dp[n];
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,5,8,1,9};
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(MaxSum(arr,n-1,dp));
    }
}
