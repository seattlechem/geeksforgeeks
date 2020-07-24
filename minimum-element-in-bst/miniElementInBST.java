/* A binary search tree node class

class Node
{
	int data;
	Node left,right;

	Node(int d)
	{
		data = d;
		left = right = null;
	}
}
*/
// your task is to complete the below function
class Tree {
  int minValue(Node node) {
    if (node == null) {
      return -1;
    } else if (node.left == null && node.right == null) {
      return node.data;
    } else if (node.left == null) {
      return node.data;
    } else {
      return minValue(node.left);
    }
  }
}
