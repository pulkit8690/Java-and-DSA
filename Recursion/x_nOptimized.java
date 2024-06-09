package Recursion;

public class x_nOptimized {
    public static double x_powern(double x,int n)
    {
        long N=n;
        if(N<0)
        {
            x=1/x;
            N=-N;
        }
        return powerOptimized(x,N);
    }
    private static double powerOptimized(double x, long N)
    {
        if(N==0)
        {
            return 1;
        }
        double halfPow=powerOptimized(x, N/2);
        double half_power_sq=halfPow*halfPow;
        if(N%2!=0)
        {
            half_power_sq=x*half_power_sq;
        }
        return half_power_sq;
    }
    
    public static void main(String[] args) {
        int x=-2;
        int n=3;
        System.out.println(x_powern(x,n));
    }
}
