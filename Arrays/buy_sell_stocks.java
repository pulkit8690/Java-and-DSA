/*
 1. Profit=Selling Price - Buy Price
 2. Time Complexity = O(n)
 */

//package Arrays;

import java.util.Scanner;

public class buy_sell_stocks {
    public static void print(int arr[])
    {
        System.out.print("Stock Price: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
    }
    public static int buy_sell(int arr[])
    {
        int buy_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(buy_price<arr[i])
            {
                int Profit=arr[i]-buy_price;
                max_profit=Math.max(max_profit, Profit);
            }
            else
            {
                buy_price=arr[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number of days: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.print("Enter Price of Stock on each Day: ");
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println(); 
        System.out.print("Maximum Profit: ");
        int b_s=buy_sell(arr);
        System.out.print(b_s);
    }
}
