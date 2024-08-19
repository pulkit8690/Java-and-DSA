
// Time Complexity O(2^n)
public class ClimbingStairs_UsingRecursion {
    public static int CountWays(int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        return CountWays(n-2) + CountWays(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(CountWays(n));
    }
}
