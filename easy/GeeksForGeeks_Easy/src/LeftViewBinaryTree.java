import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class LeftViewBinaryTree {
    private static void getLeftViewUtil(Node root, int currLevel, List<Integer> values) {
        if (root == null)
            return;

        if (maxLevelSeenSoFar < currLevel) {
            values.add(root.data);
            maxLevelSeenSoFar = currLevel;
        }

        getLeftViewUtil(root.left, currLevel + 1, values);
        getLeftViewUtil(root.right, currLevel + 1, values);

    }

    private static int maxLevelSeenSoFar = 0;

    static ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> values = new ArrayList<>();
        getLeftViewUtil(root, 1, values);
        maxLevelSeenSoFar = 0;
        return values;
    }
}
