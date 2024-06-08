package Recursion;

import java.util.Scanner;

public class decreasing {
    public static void dec(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        dec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        sc.close();
        dec(n);
    }
}
