public class HeapSort_Descending {
    public static void heapify(int arr[], int i, int size)
    {
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;
        if(left<size && arr[left]<arr[size])
        {
            minIdx=left;
        }
        if(right<size && arr[right]<arr[size])
        {
            minIdx=right;
        }
        if(minIdx!=i)
        {
            //Swap
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
            heapify(arr, minIdx, size);
        }
    }
    public static void heapSort(int arr[])
    {
        int n=arr.length;
        for(int i=n/2;i>=0;i++)
        {
            heapify(arr, i, n);
        }
        //Push Smaller at last
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,0 , i);
        }
    }
    public static void main(String[] args) {
        int arr[]={56,1,65,3,4,90,100};
        heapSort(arr);
        heapSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
