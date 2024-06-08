package Recursion;

public class sorted_array {
    public static boolean issorted(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={5,6,9,10};
        if(issorted(arr,0)==true)
        {
            System.out.println("Array is Sorted");
        }
        else
        {
            System.out.println("Array is not Sorted");
        }
    }
}
