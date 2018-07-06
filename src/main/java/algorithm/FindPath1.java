package algorithm;

import java.util.ArrayList;

public class FindPath1 {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<ArrayList<Integer>> arrayLists =new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null) return arrayLists;
        list.add(root.val);
        target -=root.val;
        if (0==target&& root.right==null&&root.left==null)
            arrayLists.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return arrayLists;
    }

    public static void main(String[] args) {

    }
}
