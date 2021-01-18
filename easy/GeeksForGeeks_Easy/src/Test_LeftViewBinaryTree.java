import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Test_LeftViewBinaryTree {
    @Test
    public void assertNullRoot() {
        BTNode tree = new BTNode(3);
        tree.left = new BTNode(2);
        tree.left.left = new BTNode(1);

        ArrayList<Integer> res = LeftViewBinaryTree.leftView(tree);

        String ans = "";

        for (int i = 0; i < res.size(); i++) {
            ans += Integer.toString(res.get(i)) + " ";
        }
        System.out.println(ans);
        assertEquals(ans, "3 2 1 ");

    }
}
