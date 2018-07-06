package algorithm;

public class MirrorTree {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
