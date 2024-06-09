
//package Arrays;
import java.util.*;
public class sub_arrays {
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void subarray(int arr[])
    {
        int n=arr.length;
        int total_subarray=(n*(n+1)/2);
        System.out.println("Total Subarray are: "+ total_subarray);
        //int arr_sum=new int[n];
        int sum=0;
        int sum_min=Integer.MAX_VALUE;
        int sum_max=Integer.MIN_VALUE;
        System.out.println("Subarray    ||    Sum");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.println("||  "+sum);
                if(sum>sum_max)
                {
                    sum_max=sum;
                }
                if(sum<sum_min)
                {
                    sum_min=sum;
                }
                sum=0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Largest Value of Sum is: "+sum_max);
        System.out.println("Smallest Value of Sum is: "+ sum_min);
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
        System.out.println("Sub Arrays are: ");
        subarray(arr);
        sc.close();
    }
}
