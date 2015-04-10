import sun.reflect.generics.tree.Tree;

/**
 * Created by Feeshne on 2015/3/19.
 */
public class ValidateBinarySearchTree {
    public static void main(String[] args) {
//        TreeNode a = new TreeNode(3);
//        TreeNode b = new TreeNode(1);
//        TreeNode c = new TreeNode(5);
//        TreeNode d = new TreeNode(0);
//        TreeNode e = new TreeNode(2);
//        TreeNode f = new TreeNode(4);
//        TreeNode g = new TreeNode(6);
//        TreeNode h = new TreeNode(3);
//        a.left = b;
//        a.right = c;
//        b.left = d;
//        b.right = e;
//        c.left = f;
//        c.right = g;
//        e.right = h;
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(1);
        a.left=b;
        System.out.println(isValidBST(a));
    }

    public static boolean isValidBST(TreeNode root) {
        if (null == root) {
            return true;
        }
        return isValid(root, root.left, root.right);
    }

    public static boolean isValid(TreeNode root, TreeNode left, TreeNode right) {
        boolean isValid = false;
        if (root == null) {
            return true;
        }
        if (left != null) {
            if (left.val < root.val) {
                isValid = true;
            } else {
                isValid = false;
            }
        }
        if (right != null) {
            if (right.val > root.val) {
                isValid = true;
            } else {
                isValid = false;
            }
        }
        return isValid ? isValid(left, left.left, left.right) && isValid(right, right.left, right.right) : false;
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
