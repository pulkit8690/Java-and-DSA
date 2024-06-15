package ArrayList;

import java.util.ArrayList;

public class Reverse {
    public static void print(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        print(list1);
        for(int i=list1.size()-1;i>=0;i--)
        {
            System.out.print(list1.get(i)+" ");
        }
    }
}
