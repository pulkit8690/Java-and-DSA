/*
for descending order using Sort Function use 
1. Array as object instead of primitive datatype
that is instead of int arr use Integer arr
2. Use Collections
Arrays.sort(arr,Collection.reverseOrder())
*/
import java.util.*;
public class SortFunction_desending
{
    public static void print(Integer arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int length=sc.nextInt();
        Integer arr[]=new Integer[length];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println();


        // Use Sort function 
        //Arrays.sort(arr,Collections.reverseOrder()); // sort in increasing order
        
        Arrays.sort(arr,0,3,Collections.reverseOrder()); // (array,startIndex,endIndex) endindex is non inclusive ie if u want to sort upto 2nd index then write 3

        print(arr);
    }
}