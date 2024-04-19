/*
 for -inf value---> Integer.MIN_VALUE;
 for +inf value---> Integer.MAX_VALUE;
 */


package Arrays;

import java.util.Scanner;

public class largest_smallest_number{
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int largest(int arr[])
    {
        int large=Integer.MIN_VALUE; // -inf value
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
    public static int smallest(int arr[])
    {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
        }
        return small;
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
        System.out.println("Finding largest and Smallest Element");
        int large=largest(arr);
        System.out.println("Largest Element in the Array is "+large);
        int small=smallest(arr);
        System.out.println("Smallest Element in the Array is "+small);

    }
}
