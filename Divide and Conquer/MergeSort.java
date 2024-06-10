//package Divide and Conquer;

// Time Complexity O(nlogn)
// Space Complexity O(n)
import java.util.*;
public class MergeSort {
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge_sort(int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
         int mid= si+(ei-si)/2;
         merge_sort(arr, si, mid); // sort the left part
         merge_sort(arr, mid+1, ei); // sort the right part
         merge(arr,mid,si,ei);// merge both the sorted arrays
    }
    public static void merge(int arr[],int mid, int si,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;// iterator index of right part
        int j=mid+1;// Iterator of left part
        int k=0; //iterator of temp array
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for left over elements of 1st sorted array
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        // for left over elements of 2nd sorted array
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }
        // copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
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
        System.out.println("After Merge Sort");
        merge_sort(arr, 0, arr.length-1);
        print(arr);
        sc.close();
    }
}
