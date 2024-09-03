//https://www.naukri.com/code360/problems/frog-jump_3621012
public class FrogJump_Recursion {
    public static int find(int n,int ht[])
    {
        if(n==0) return 0;
        int left= find(n-1, ht) + Math.abs(ht[n]-ht[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1)
        {
            right=find(n-2, ht)+Math.abs(ht[n]-ht[n-2]);
        }
        return Math.min(left, right);
    }
    public static void main(String[] args) {
        int n=3;
        int heights[]={10,20,30,10};
        System.out.println(find(n,heights));
    }
}
