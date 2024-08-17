import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int KthSmall(int arr[], int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        
        for(int j=0;j<k-1;j++)
        {
            pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=3;
        System.out.println(KthSmall(arr,k));
    }
}
