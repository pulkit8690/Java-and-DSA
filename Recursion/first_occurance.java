package Recursion;

public class first_occurance {
    public static int occur(int arr[],int k,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(k == arr[i])
        {
            return i;
        }
        return occur(arr, k, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,8,5,9};
        int ans=occur(arr,5, 0);
       if(ans==-1)
       {
        System.out.println("Not Found");
       }
       else
       {
        System.out.println("Key Found at index "+ans);
       }
    }
}
