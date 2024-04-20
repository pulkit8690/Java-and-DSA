/*
 1. Time Complexity-->O(n^2)
        inner loop-->n+(n-1)+(n-2)+(n-3)+----
        outter loop--> O(n)
 2. Total Pair = n(n-1)/2
 */


package Arrays;
import java.util.*;
public class pairs_Array {
    
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void pair(int arr[])
    {
       // int tp=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println();
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
                //tp++;
            }
        }
        int n=arr.length;
        int tp=(n*(n-1))/2;
        System.out.println("Total Pairs in Array are: "+tp);
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
        System.out.println("Pairs is Array are: ");
        pair(arr);
    }
}
