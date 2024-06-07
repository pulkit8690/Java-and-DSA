/*
 1. Brute Force Appraoch
    In This Approach I Use 3 loops to Calculate Max Sub Array Sum
        Ist Loop is used to get starting element of Subarray
        2nd Loop is used to get Ending element of Subarray
        3rd Loop is used to get max subarray sum
        Then comparing Sum with max sum we find max subaarray sum
    Time Complexity is O(n^3)
 */
/*
 2. Optimal Approach Using Prefix Sum
    In this Approach I First Calculate Prefix sum Array using this formula
        prefix_array[0]=arr[0];
        prefix_array[i]=prefix_array[i-1]+arr[i];
    Then first and Second loop is to get starting(i) and Ending(j) element Respectively
        Calulating Max Sub Array Using Formula:
            sum= i==0 ? prefix_array[j] : prefix_array[j]-prefix_array[i-1]
    Time Complexity is O(n^2)
 */
/*
 3. Kadane Algorithm(Best Approach)
    First Check if all elements of array are -ve 
        If yes then return largest value among them
    If any one of the Element is +ve
        If Curr Sum is negative make it zero and Update Max sum
    Time Complexity--> O(n)
 */


//package Arrays;
import java.util.*;
public class max_subarray {
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    /*   Brute Force Approach
    */
    public static void Maxsubarray(int arr[])
    {
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<=arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<j;k++)
                {
                    sum=sum+arr[k];
                    if(sum>max_sum)
                    {
                        max_sum=sum;
                    }
                }
            }
        }
        System.out.println(max_sum);
    }

    /* Optimal Approach Using Prefix Sum
    */
    public static void PrefixSum(int arr[])
    {
        int prefix_array[]=new int[arr.length];
        prefix_array[0]=arr[0];
        for(int i=1;i<arr.length;i++ )
        {
            prefix_array[i]=prefix_array[i-1]+arr[i];
        }
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                sum= i==0 ? prefix_array[j] : prefix_array[j]-prefix_array[i-1];
                if(sum>max_sum)
                {
                    max_sum=sum;
                }
                sum=0;
            }
        }
        System.out.println(max_sum);
    }

/*
 3. Kadane Algorithm(Best Approach)
 */

    public static void kadane(int arr[])
    {
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        int count=0;
        // Checking If All Arrray Elements are Negative
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                count++;
            }
        }
        if(count==arr.length)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>max_sum)
                {
                    max_sum=arr[i];
                }
            }
            System.out.println(max_sum);
        }

        // If Any Single Element is +ve(Main Code)
        else
        {
        for(int i=0;i<arr.length;i++)
        {
            cur_sum=cur_sum+arr[i];
            if(cur_sum<0)
            {
                cur_sum=0;
            }
            if(cur_sum>max_sum)
            {
                max_sum=cur_sum;
            }
        }
        System.out.println(max_sum);
    }
}
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println();  
        System.out.print("Max Sub Array Sum is: ");
        Maxsubarray(arr); //(O(n^3))
        PrefixSum(arr); //(O(n^2))
        kadane(arr); //(O(n))
        sc.close();
    }
}
