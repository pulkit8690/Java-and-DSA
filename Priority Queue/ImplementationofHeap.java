import java.util.*;

public class ImplementationofHeap { 
    public static class Heap{
        ArrayList<Integer> arr= new ArrayList<>();
        public void add(int data) //O(log n)
        {
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while (arr.get(x)<arr.get(par)) // change sign for mAx heap
            {
                //Swap
                int temp= arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par, temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek()
        {
            return arr.get(0);
        }
        public int remove() //O(log n)
        {
            int data= arr.get(0);
            //Step 1: Swap 1st and Last
            int temp= arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // Step2 Remove Last;
            arr.remove(arr.size()-1);

            //Heapify
            heapify(0);
            return data;
        }
        private void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<arr.size() && arr.get(left)<arr.get(minIdx)) // change sign for mAx heap
            {
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)) // change sign for mAx heap
            {
                minIdx=right;
            }
            if(minIdx!=i)
            {
                //Swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }
        public boolean isEmpty()
        {
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap hp = new Heap(); 
        hp.add(10);
        hp.add(20);
        hp.add(5);
        hp.add(15);
        hp.add(3);
        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }

    }
}
