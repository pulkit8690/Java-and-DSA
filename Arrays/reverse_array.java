/*
 1. First approch is to itrate the loop from last and print array elements
        it has time complexity-->O(n)
        it has Space Complexity-->O(n)
 2. Second Approch is to Swap First and last element
        it has time complexity-->O(n)
        it has Space Complexity-->O(1)
 */
package Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    /*  This is Not Optimal as here Space Complexity is O(n)
    public static void reverse(int arr[])
    {
        int i=arr.length-1;
        while (i>=0) 
        {
            System.out.print(arr[i]+" ");
            i--;
        }
    }
    */
    public static void reverse_swap(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
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
        System.out.println("Reverse of array is: ");
        //reverse(arr);
        reverse_swap(arr);
        print(arr);
    }
}
