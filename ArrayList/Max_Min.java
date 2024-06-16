//package ArrayList;

import java.util.ArrayList;

public class Max_Min {
    public static void print(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static int max(ArrayList<Integer> list)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> list)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(min>list.get(i))
            {
                min=list.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(-1);
        list1.add(3);
        list1.add(43);
        list1.add(5);
        print(list1);
        System.out.println("The Maximum Element in List is "+max(list1));
        System.out.println("The Minimum Element in List is "+min(list1));
    }
}
