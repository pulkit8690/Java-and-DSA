package Recursion;
//https://www.geeksforgeeks.org/problems/friends-pairing-problem5425/1
import java.util.Scanner;

public class friends_paring {
    public static int NumberOfWays(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        int fnm1=NumberOfWays(n-1);
        int fnm2=NumberOfWays(n-2);
        int pair=(n-1);
        int total_ways=fnm1 + pair*fnm2;
        return total_ways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of friends: ");
        int n= sc.nextInt();
        sc.close();
        System.out.print("Total Number of Ways friends can be paired: "+NumberOfWays(n));
    }
}
