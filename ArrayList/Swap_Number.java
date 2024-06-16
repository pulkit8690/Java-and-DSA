//package ArrayList;

import java.util.ArrayList;

public class Swap_Number {
    public static void print(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void Swap(ArrayList<Integer> list, int i,int j)
    {
       int temp=list.get(i);
       list.set(i,list.get(j));
       list.set(j,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(-1);
        list1.add(3);
        list1.add(43);
        list1.add(5);
        print(list1);
        int i=2;
        int j=3;
        Swap(list1,i,j);
        print(list1);
    }
}
