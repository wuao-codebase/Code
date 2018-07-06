package algorithm;

public class HasSubtree1 {

    boolean isSubtree(TreeNode pRootA, TreeNode pRootB) {
        if (pRootB == null) return true;
        if (pRootA == null) return false;
        if (pRootB.val == pRootA.val) {
            return isSubtree(pRootA.left, pRootB.left)
                    && isSubtree(pRootA.right, pRootB.right);
        } else return false;
    }
    public boolean HasSubtree(TreeNode pRootA, TreeNode pRootB)
    {
        if (pRootA == null || pRootB == null) return false;
        return isSubtree(pRootA, pRootB) ||
                HasSubtree(pRootA.left, pRootB) ||
                HasSubtree(pRootA.right, pRootB);
    }

}
