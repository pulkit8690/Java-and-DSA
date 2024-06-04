
/* Sort Function
 Arrays.sort(arr) has Time complexity O(nlogn)

*/

import java.util.*;
public class SortFunction
{
    public static void print(int arr[])
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
        int arr[]=new int[length];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<length;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println();


        // Use Sort function 
        //Arrays.sort(arr); // sort in increasing order
        
        Arrays.sort(arr,0,3); // (array,startIndex,endIndex) endindex is non inclusive ie if u want to sort upto 2nd index then write 3

        print(arr);
    }
}