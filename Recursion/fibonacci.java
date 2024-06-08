/*
 Time Complexity: O(2^n) /// Very Bad 
 Space Complexity:  O(n)
 */


package Recursion;

public class fibonacci {
    public static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int fibo_n_1=fibo(n-1);
        int fibo_n_2=fibo(n-2);
        int fibo_n=fibo_n_1+fibo_n_2;
        return fibo_n;
    }
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
        {
            System.out.print(fibo(i)+" ");
        }
    }
}
