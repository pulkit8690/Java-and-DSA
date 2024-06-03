/*
 Time Complexity of Linear Search--> O(n)
 */



//package Arrays;

import java.util.Scanner;

public class linear_search {
    public static int linear(int arr[], int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
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
        //int arr[]={3,5,6,7,9};
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
        System.out.println("\n");
        System.out.println("Performing Linear Searching");
        System.out.print("What Element you want to Search: ");
        int key=sc.nextInt();
        int ans=linear(arr,key);
        if(ans==-1)
        {
            System.out.println("Element Not FOUND!");
        }
        else
        {
        System.out.println(key+" is found  at Index: "+ans);
        }
    }
}
