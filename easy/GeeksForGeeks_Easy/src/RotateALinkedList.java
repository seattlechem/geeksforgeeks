public class RotateALinkedList {
    static Node rotate(Node head, int k) {
        if (k < 1)
            return head;
        Node current = head;
        Node kthNode = null;

        for (int i = 1; i < k && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return null;
        }

        kthNode = current;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        head = kthNode.next;
        kthNode.next = null;

        return head;
    }
}

class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    static Node BuildLinkedList(int[] ll) {
        Node head = new Node();
        head.data = ll[0];
        Node node = head;

        for (int i = 1; i < ll.length; i++) {
            node.next = new Node();
            node.next.data = ll[i];
            node = node.next;
        }
        return head;
    }

    static String convertLLToString(Node head) {
        String stringData = "";
        Node current = head;
        while (current != null) {
            stringData += String.valueOf(current.data) + " ";
            current = current.next;
        }
        return stringData.trim();
    }
}
