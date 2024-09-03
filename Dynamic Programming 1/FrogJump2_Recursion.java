//https://atcoder.jp/contests/dp/tasks/dp_b
public class FrogJump2_Recursion {
    public static int fun(int n, int k, int ht[])
    {
        if(n==0) return 0;
        int minSteps= Integer.MAX_VALUE;
        for(int j=1;j<k;j++)
        {
            if(n-j >=0)
            {
                int steps= fun(n-j, k, ht) + Math.abs(ht[j]-ht[n-j]);
                minSteps=Math.min(steps, minSteps);
            }
        }
        return minSteps;
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int ht[]={10,30,40,50,20};
        System.out.println(fun(n,k,ht));
    }
}
