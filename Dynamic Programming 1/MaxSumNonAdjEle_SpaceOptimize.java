public class MaxSumNonAdjEle_SpaceOptimize {
    public static int MaxSum(int arr[], int n)
    {
        int prev1=arr[0];
        int prev2=0;
        int cur=0;
        for(int i=1;i<=n;i++)
        {
            int pick= arr[i];
            if(i>1) pick+=prev2;
            int not_pick=prev1;
            cur=Math.max(pick, not_pick);
            prev2=prev1;
            prev1=cur;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,5,8,1,9};
        int n=arr.length;
        System.out.println(MaxSum(arr,n-1));
    }
}
