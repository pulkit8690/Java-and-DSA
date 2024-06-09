// https://www.geeksforgeeks.org/problems/ways-to-tile-a-floor5836/1

package Recursion;

import java.util.Scanner;

/*Given a floor of dimensions 2 x n and tiles of dimensions 2 x 1, the task is to find the number of ways the floor can be tiled.
A tile can either be placed horizontally i.e as a 1 x 2 tile or vertically i.e as 2 x 1 tile
*/
public class TillingProblem 
{
    public static int NumberOfWays(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        // Vertical Choice
        int fnm1=NumberOfWays(n-1);
        // Horizontal Choice
        int fnm2=NumberOfWays(n-2);
        int total_ways=fnm1+fnm2;
        return total_ways;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Floor with width 2: ");
        int n= sc.nextInt();
        System.err.println("Dimension of Floor 2*"+n);
        sc.close();
        System.out.print("Total Number of Ways: "+NumberOfWays(n));
    }
}
