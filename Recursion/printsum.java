package Recursion;

import java.util.Scanner;

public class printsum {
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int s_n_1=sum(n-1);
        int s_n= n+s_n_1;
        return s_n;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        sc.close();
        System.out.println(sum(n));
    }
}
