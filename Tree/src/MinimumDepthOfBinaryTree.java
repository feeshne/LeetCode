import sun.reflect.generics.tree.Tree;

/**
 * Created by Feeshne on 2015/3/17.
 */
public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(0);
        System.out.println(minDepth(a));
    }

    public static int minDepth(TreeNode root) {
        int depth = 0;
        Integer minDepth = Integer.MAX_VALUE;
        int[] a=new int[1];
        a[0]=Integer.MAX_VALUE;
        if (null == root) {
            return 0;
        }
        minDepth(root, depth, a);
        return a[0];
    }

    public static void minDepth(TreeNode root, int depth, int[] a) {
        if (null == root) {
            return;
        }
        depth++;
        if (null == root.left && null == root.right && depth < a[0]) {
            a[0] = depth;
            depth--;
            return;
        } else {
            minDepth(root.left, depth, a);
            minDepth(root.right, depth, a);
        }
        depth--;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
