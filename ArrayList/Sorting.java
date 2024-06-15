package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(-1);
        list1.add(3);
        list1.add(43);
        list1.add(5);
        print(list1);
        Collections.sort(list1);// Sort in Ascending Order
        print(list1);
        Collections.sort(list1, Collections.reverseOrder()); // Sort in Descending Order
        print(list1);
    }
}
// reverseOrder() is Comparator and this can be applied on objects also
// Comparator is a function which defines the logic of Sorting 