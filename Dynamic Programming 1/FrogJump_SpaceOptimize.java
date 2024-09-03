public class FrogJump_SpaceOptimize {
    public static int fun(int n , int ht[])
    {
        if(n==0) return 0;
        int prev1=0,prev2=0,curr=0;
        for(int i=1;i<=n;i++)
        {
            int left=prev1+ Math.abs(ht[i]-ht[i-1]);
            int right=Integer.MAX_VALUE;
            if(i>1)
            {
                right=prev2+ Math.abs(ht[i]-ht[i-2]);
            }
            curr=Math.min(left, right);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int n=3;
        int heights[]={10,20,30,10};
        System.out.println(fun(n,heights));
    }
}
