//package Recursion;

public class x_n {
    public static int x_powern(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int x_n_1=x_powern(x, n-1);
        int x_n=x*x_n_1;
        return x_n;
    }
    
    public static void main(String[] args) {
        int x=2;
        int n=3;
        System.out.println(x_powern(x,n));
    }
}
