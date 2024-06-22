//https://leetcode.com/problems/peak-index-in-a-mountain-array

public class ReturnPeakOfMountain {
    public static int peakIndex(int arr[])
    {
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid-1])
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={0,1,0};
        int arr2[]={0,2,1,0};
        int arr3[]={0,5,10,2};
        System.out.println(peakIndex(arr1));
        System.out.println(peakIndex(arr2));
        System.out.println(peakIndex(arr3));
    }
}
