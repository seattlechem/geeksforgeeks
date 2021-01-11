import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Test_LeftViewBinaryTree {
    @Test
    public void assertNullRoot() {
        Node tree = new Node(3);
        tree.left = new Node(2);
        tree.left.left = new Node(1);

        ArrayList<Integer> res = LeftViewBinaryTree.leftView(tree);

        String ans = "";

        for (int i = 0; i < res.size(); i++) {
            ans += Integer.toString(res.get(i)) + " ";
        }
        System.out.println(ans);
        assertEquals(ans, "3 2 1 ");

    }
}
