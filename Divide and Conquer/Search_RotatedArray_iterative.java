public class Search_RotatedArray_iterative
{
    public static int search(int arr[],int key)
    {
        int si=0;
        int ei=arr.length-1;
        
       
        while(si<=ei)
        {
            int mid=si+(ei-si)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[si]<=arr[mid])
            {
                if( arr[si]<=key && key<arr[mid])
                {
                    ei=mid-1;
                }
                else
                {
                    si=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=key && key<=arr[ei])
                {
                    si=mid+1;
                }
                else
                {
                    ei=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,0,1,2};
        int key=5;
        System.out.println(search(arr,key));
    }
}