//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class First_LastPositionOfElement_SortedArray {
    public static int[] position(int arr[],int key)
    {
        int ans[]=new int[2];
        ans[0]=firstOccur(arr,key);
        ans[1]=lastOccur(arr,key);
        return ans;
    }
    
    public static int firstOccur(int nums[], int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                end= mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
    public static int lastOccur(int nums[], int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                start = mid+1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,5,6};
        int[] positions = position(arr, 5);
        for(int i=0;i<positions.length;i++)
        {
            System.out.print(positions[i]+" ");
        }

    }
}
