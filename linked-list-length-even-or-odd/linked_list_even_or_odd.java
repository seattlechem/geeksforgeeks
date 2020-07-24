
class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

/*
 * isLengthEvenorOdd method should return 1 if the length of LL is even
 * otherwise return 0.
 */

class GFG {
  int isLengthEvenorOdd(Node head1) {
    Node p = head1;

    while (true) {
      if (p == null) {
        return 0;
      }
      if (p.next == null) {
        return 1;
      }
      p = p.next.next;
    }
  }
}
