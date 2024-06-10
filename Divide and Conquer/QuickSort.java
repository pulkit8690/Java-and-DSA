//package Divide and Conquer;
/*
 Average TC = o(nlogn)
 Worst case TC = O(n^2)--> Worst case occurs when pivot element is always smallest or the largest element.
                           When solve that recursion it will form an AP 1+2+3 +--+ (n-1)+n = n(n+1)/2 =O(n^2)
 Space Complexity= O(1)
 */
import java.util.*;
public class QuickSort {
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quick_sort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pvid=partition(arr,si,ei);
        quick_sort(arr, si, pvid-1);
        quick_sort(arr, pvid+1, ei);
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<arr.length;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
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
        System.out.println("After Quick Sort");
        quick_sort(arr, 0, arr.length-1);
        print(arr);
        sc.close();
    }
}
