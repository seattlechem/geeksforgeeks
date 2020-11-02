// https://practice.geeksforgeeks.org/problems/circular-linked-list/0/?category[]=Linked%20List&difficulty[]=-1&page=1&query=category[]Linked%20Listdifficulty[]-1page1#

public class CheckIfcircularLinkedList {
    boolean isCircular(Node head) {
        // Your code here
        // Empty linked list is circular
            if (head == null)
                return true;

            Node node = head.next;

            while (node != null && node != head) {
                node = node.next;
            }
            if (node == head)
                return true;
            return false;


        }
}
