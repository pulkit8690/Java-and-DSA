/*
Bubble sort takes minimum time (Order of n) when elements are already sorted. 
Hence it is best to check if the array is already sorted or not beforehand, to avoid O(N2) time complexity.
*/


import java.util.*;
public  class BubbleSort_Optimized
{
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void bubble(int arr[])
    {
        boolean swap;
        for(int turn=0;turn<arr.length-1;turn++)
        {
            swap=false;
            for(int j=0;j<arr.length-1-turn;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)
            {
                break;
            }
        }
    }
    public static void main(String args[])
    {
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
        System.out.println("After Bubble Sort");
        bubble(arr);
        print(arr);
        sc.close();
    }
}