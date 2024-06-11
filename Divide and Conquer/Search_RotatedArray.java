

public class Search_RotatedArray {
    public static int search(int arr[],int si,int ei,int key)
    {
        if(si>ei)
        {
            return -1;
        }
        int mid= si+(ei-si)/2;
        // If key is found on mid
        if(arr[mid]==key)
        {
            return mid;
        }
        // Case 1: Mid on L1
        if(arr[si]<=arr[mid])
        {
            // Case a: left
            if(arr[si]<=key && key<arr[mid])
            {
                return search(arr, si, mid-1, key);
            }
            // Case b: right
            else
            {
                return search(arr, mid+1, ei, key);
            }
        }
        // Case 2: Mid on L2
        
        else
        {
            // Case c: right
            if(arr[mid]<=key && key<=arr[ei])
            {
                return search(arr, mid+1, ei, key);
            }
            else
            // Case d: left
            {
                return search(arr, si, mid-1, key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,0,1,2};
        int key=2;
        System.out.println(search(arr,0,arr.length-1,key));
    }
}
