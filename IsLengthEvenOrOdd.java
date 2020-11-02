class Node{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class IsLengthEvenOrOdd {
    int isLengthEvenorOdd(Node head1)
	{
    	while (head1 != null && head1.next != null)
        {
            // traverse by 2 nodes to see if the length of linked list is even or odd
            head1 = head1.next.next;
        }
        if (head1 == null)
            return 0;
        return 1;
	}
}
