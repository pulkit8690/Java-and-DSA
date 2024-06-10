/*
 1.Array Should be Sorted for Binary Search
 2. Time Complexity---> O(log2(n))
 */
// Also Called Modified Binary Search

//package Arrays;

import java.util.Scanner;

public class Binary_Search {
    public static int search(int arr[], int key)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(key<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
        
    }
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={2,4,6,8,10,12,14,16};
        print(arr);
        System.out.println();
        System.out.println("BINARY SEARCH");
        System.out.print("What Element you want to Search: ");
        int key=sc.nextInt();
        int ans=search(arr,key);
        if(ans==-1)
        {
            System.out.println("Element Not FOUND!");
        }
        else
        {
        System.out.println(key+" is found  at Index: "+ans);
        }
        sc.close();
    }
    
}
