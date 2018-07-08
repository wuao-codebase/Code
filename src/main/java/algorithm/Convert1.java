package algorithm;

import java.util.Stack;

//二叉搜索树转换为双链表
public class Convert1 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        Stack<TreeNode> list = new Stack<>();
        TreeNode current = pRootOfTree;
        TreeNode precurrent = null;
        boolean isFirst = true;
        while (current != null || !list.isEmpty()) {
            while (current != null) {
                list.add(current);
                current = current.left;
            }
            current = list.pop();
            if (isFirst) {
                precurrent = current;
                pRootOfTree = current;
                isFirst = false;
            } else {
                precurrent.right = current;
                current.left = precurrent;
                precurrent=current;
            }
            current=current.right;
        }
        return pRootOfTree;
    }
}
