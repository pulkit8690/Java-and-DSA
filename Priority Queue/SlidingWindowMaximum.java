import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static class Pair implements Comparable<Pair> {
        int idx;
        int val;
        Pair(int idx, int val)
        {
            this.idx=idx;
            this.val=val;
        }
        @Override
        public int compareTo(Pair p2)
        {
            return p2.val-this.val; // Descending
        }
    }
    public static int[] slidingWindow(int arr[], int k) //(n log k)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int n= arr.length;
        int res[]= new int[n-k+1];
        for(int i=0;i<k;i++)
        {
            pq.add(new Pair(i, arr[i]));
        }
        res[0]=pq.peek().val;
        for(int i=k;i<n;i++)
        {
            while (pq.size()>0 && pq.peek().idx<=(i-k)) {
                pq.remove();
            }
            pq.add(new Pair(i, arr[i]));
            res[i-k+1]=pq.peek().val;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int winSize=3;
        int res[]= slidingWindow(arr,winSize);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
