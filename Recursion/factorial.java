package Recursion;
// Time Complexity O(n)
// Space Complexity O(n)
import java.util.Scanner;

public class factorial {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int f_n_1=fact(n-1);   // f_n_1 = factorial(n-1)
        int f_n=n*f_n_1;       
        return f_n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        sc.close();
        int ans =fact(n);
        System.out.println("Factorial of "+n+" is "+ans);

    }
    
}
