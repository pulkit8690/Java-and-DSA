package Arrays;
import java.util.*;
public class max_subarray {
    public static void print(int arr[])
    {
        System.out.print("Array Elements: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Maxsubarray(int arr[])
    {
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<=arr.length;j++)
            {
                int sum=0;
                for(int k=i;k<j;k++)
                {
                    sum=sum+arr[k];
                    if(sum>max_sum)
                    {
                        max_sum=sum;
                    }
                }
            }
        }
        System.out.println(max_sum);
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
        System.out.print("Max Sub Array Sum is: ");
        Maxsubarray(arr);
    }
}
