/*
 You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array 
 represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */

public class Jump1_Recursion {
    public static boolean canJump(int arr[])
    {
        int n=arr.length-1;
        return helper(arr,0,n);
    }
    public static boolean helper(int arr[], int i, int n)
    {
        if(i==n) return true;
        if(arr[i]==0 || i>n) return false;
        for(int j=1;j<=arr[i];j++)
        {
            if(helper(arr, i+j, n))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
