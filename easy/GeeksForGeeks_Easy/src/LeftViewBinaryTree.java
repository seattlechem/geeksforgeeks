import java.util.ArrayList;
import java.util.List;

class BTNode {
    int data;
    BTNode left, right;

    BTNode(int item) {
        data = item;
        left = right = null;
    }
}

class LeftViewBinaryTree {
    private static void getLeftViewUtil(BTNode root, int currLevel, List<Integer> values) {
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

    static ArrayList<Integer> leftView(BTNode root) {
        ArrayList<Integer> values = new ArrayList<>();
        getLeftViewUtil(root, 1, values);
        maxLevelSeenSoFar = 0;
        return values;
    }
}
