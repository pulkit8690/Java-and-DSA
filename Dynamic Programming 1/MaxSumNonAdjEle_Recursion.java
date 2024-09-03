//https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261

public class MaxSumNonAdjEle_Recursion {
    public static int MaxSum(int arr[], int n)
    {
        if(n==0) return arr[0];
        if(n<0) return 0;
        int pick = arr[n]+MaxSum(arr, n-2);
        int not_pick= MaxSum(arr, n-1);
        return Math.max(pick, not_pick);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,5,8,1,9};
        int n=arr.length;
        System.out.println(MaxSum(arr,n-1));
    }
}
