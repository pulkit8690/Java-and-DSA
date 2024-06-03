/*
 Trappinng Rainwater
 1. minimum bar needed for trapping rainwater should be greator than 2
 2. Bar height should not be in increasing or decreasing order to trap rain water
 3. water_trapped= water_level - height[bar]
 4. water_level=min(left_max_height_bar,    right_max_height_bar)
 5. Time Complexity of code--> O(n)
 */
//package Arrays;
import java.util.*;
public class trapping_rainwater {
    public static void print(int arr[])
    {
        System.out.print("Bar Height: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
    }

    public static int trapped_water(int arr[],int width)
    {
        int n=arr.length;
        int left_max[]=new int[n];
        left_max[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left_max[i]=Math.max(arr[i], left_max[i-1] );
        }

        int right_max[]=new int[n];
        right_max[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right_max[i]=Math.max(arr[i], right_max[i+1]);
        } 
        int water_trapped=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(left_max[i], right_max[i]);
            water_trapped +=waterlevel-arr[i];
        }
        return water_trapped;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Number of bars: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.print("Enter Width of Bar: ");
        int width=sc.nextInt();
        System.out.print("Enter Height of bars: ");
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println(); 
        System.out.print("Total Rain Water Trapped: ");
        int t_w=trapped_water(arr, width);
        System.out.print(t_w+ " units");
    }
     
}
