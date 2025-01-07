import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedList2Test {

    LinkedList2 listWithCycle;
    LinkedList2 listWithoutCycle;
    LinkedList2 emptyList;

    @BeforeEach
    public void setUp() {
        // Set up list with cycle
        listWithCycle = new LinkedList2();
        listWithCycle.add(1);
        listWithCycle.add(2);
        listWithCycle.add(3);
        listWithCycle.add(4);
        listWithCycle.head.next.next.next.next = listWithCycle.head.next; // Create cycle

        // Set up list without cycle
        listWithoutCycle = new LinkedList2();
        listWithoutCycle.add(1);
        listWithoutCycle.add(2);
        listWithoutCycle.add(3);
        listWithoutCycle.add(4);

        // Set up empty list
        emptyList = new LinkedList2();
    }

    @Test
    public void testRemoveCycle_ListWithCycle() {
        assertTrue(listWithCycle.isCycle());
        listWithCycle.removeCycle();
        assertFalse(listWithCycle.isCycle());
    }

    @Test
    public void testRemoveCycle_ListWithoutCycle() {
        assertFalse(listWithoutCycle.isCycle());
        listWithoutCycle.removeCycle();
        assertFalse(listWithoutCycle.isCycle());
    }

    @Test
    public void testRemoveCycle_EmptyList() {
        assertFalse(emptyList.isCycle());
        emptyList.removeCycle();
        assertFalse(emptyList.isCycle());
    }
}