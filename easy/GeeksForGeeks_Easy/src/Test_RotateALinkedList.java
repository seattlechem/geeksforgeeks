import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_RotateALinkedList {
    @Test
    public void testOne() {
        int[] ll = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        Node head = Node.BuildLinkedList(ll);
        Node actual = RotateALinkedList.rotate(head, 4);
        String expected = "5 6 7 8 1 2 3 4";
        assertEquals(expected, Node.convertLLToString(actual));

    }

}
