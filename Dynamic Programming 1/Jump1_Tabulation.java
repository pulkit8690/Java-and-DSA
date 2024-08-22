/*
 You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array 
 represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */

import java.util.Arrays;

public class Jump1_Tabulation {
    public static boolean canJump(int arr[])
    {
        return helper(arr,arr.length)==1;
    }
    public static int helper(int arr[],int n)
    {
        int dp[]=new int[n];
        Arrays.fill(dp, 0);
        dp[0]=1;
        for(int i=0;i<n;i++ )
        {
            for(int j=1;j<=arr[i] && i+j<n;j++)
            {
                dp[i+j]=1;
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
