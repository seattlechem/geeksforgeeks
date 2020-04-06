class Solution {
  // recursive solution
  public static int getCount(Node head) {
    return head == null ? 0 : 1 + getCount(head.next);
  }

  // iterative solution
  public static int iterativeGetCount(Node head) {
    Node temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

}
