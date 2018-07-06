package algorithm;

//前序，中序遍历重组二叉树

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Re_BinaryTree {

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {

        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);

        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+(i-startIn),in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,(i-startIn)+startPre+1,endPre,in,i+1,endIn);
                break;
            }

        return root;
    }

    //前序遍历
    public void preOrder( TreeNode mNode) {
        if (mNode!= null) {
            System.out.print(mNode.val);
            inOrder(mNode.left);
            inOrder(mNode.right);
        }
        System.out.println();
    }
    //中序遍历
    public void inOrder( TreeNode mNode) {
        if (mNode!= null) {
            inOrder(mNode.left);
            System.out.print(mNode.val);
            inOrder(mNode.right);
        }
    }

    public static void main(String[] args) {
        int [] pre ={1,2,4,7,3,5,6,8};
        int [] in ={4,7,2,1,5,3,8,6};
        Re_BinaryTree re_binaryTree = new Re_BinaryTree();
        TreeNode treeNode = re_binaryTree.reConstructBinaryTree(pre, in);
        re_binaryTree.inOrder(treeNode);

    }

}
