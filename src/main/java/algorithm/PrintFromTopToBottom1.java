package algorithm;

import java.util.ArrayList;

public class PrintFromTopToBottom1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> Queue = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue.add(root);
        while (!Queue.isEmpty()){
            TreeNode temp =Queue.remove(0);
            if (temp.left!=null){
                Queue.add(temp.left);
            }
            if (temp.right!=null){
                Queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
