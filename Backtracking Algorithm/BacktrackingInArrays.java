//package Backtracking Algorithm;
// Backtracking vala Step hmesha Function call k baad lgega
public class BacktrackingInArrays {
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
    public static void changeArr(int arr[],int i,int val)
    {
        // Base Case
        if(i==arr.length)
        {
            print(arr);
            return;
        }
        // Recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1); // Function Call
        arr[i]=arr[i]-2; // Backtracking Step

    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        print(arr);
    }
}
