package Recursion;

import java.util.Scanner;

public class increasing {
    public static void inc(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        sc.close();
        inc(n);
    }
}
