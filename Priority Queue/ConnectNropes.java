import java.util.PriorityQueue;

public class ConnectNropes {
    public static int findCost(int arr[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int cost=0;
        while(pq.size()>1)
        {
        int min1= pq.remove();
        int min2= pq.remove();
        cost+= min1+min2;
        pq.add(min1+min2);
        }
        return cost; 
    }
    public static void main(String[] args) {
        int ropes[]={2,3,3,4,6}; // With Grredy Answer is 43 and with PQ ans is 41 
        System.out.println(findCost(ropes));
    }
}
