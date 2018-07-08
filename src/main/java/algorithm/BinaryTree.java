package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TNode mNode;


    class TNode {
        private Integer value;
        private TNode left;
        private TNode right;

        public TNode(Integer value, TNode left, TNode right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    //通过插入生成二叉搜索树
    public TNode insert(TNode mNode, int i) {
        if (mNode == null) {
            mNode = new TNode(i, null, null);
            return mNode;
        } else {
            if (i < mNode.value) {
                if (mNode.left == null) {
                    mNode.left = new TNode(i, null, null);
                } else {
                    this.insert(mNode.left, i);
                }
            } else {
                if (mNode.right == null) {
                    mNode.right = new TNode(i, null, null);
                } else {
                    this.insert(mNode.right, i);
                }
            }
            return mNode;
        }
    }
    //前序遍历
    public void preOrder(TNode mNode) {
        if (mNode!= null) {
            System.out.print(mNode.value);
            inOrder(mNode.left);
            inOrder(mNode.right);
        }
        System.out.println();
    }
    //中序遍历
    public void inOrder(TNode mNode) {
        if (mNode!= null) {
            inOrder(mNode.left);
            System.out.print(mNode.value);
            inOrder(mNode.right);
        }
    }

    public void inOrder1(TNode mNode) {
        Stack<TNode> stack = new Stack<>();
        while(mNode != null || !stack.empty())
        {
            while (mNode != null)
            {
                stack.push(mNode);
                mNode = mNode.left;
            }
            mNode = stack.pop();
            System.out.print(mNode.value + "   ");
            mNode = mNode.right;

        }
    }


    //后序遍历
    public void postOrder(TNode mNode) {
        if (mNode!= null) {
            inOrder(mNode.left);
            inOrder(mNode.right);
            System.out.print(mNode.value);
        }
        System.out.println();
    }
    public void LevelOrder(TNode mNode){
        if (mNode == null) {
            return;
        }
        Queue<TNode> queue= new LinkedList<TNode>();
        queue.offer(mNode);
        while (!queue.isEmpty()){
            TNode poll = queue.poll();
            System.out.print(poll.value);
            if (poll.left != null) {
                queue.offer(poll.left);
            }
            if (poll.right != null) {
                queue.offer(poll.right);
            }
        }
        System.out.println();
    }
    //普通二叉树查找最大值
    public int FindMax(TNode mNode){
        int left,right,max=Integer.MIN_VALUE;
        if (mNode != null) {
             max = mNode.value;
             left=this.FindMax(mNode.left);
             right=this.FindMax(mNode.right);
             if (left>max)
                 max=left;
             if (right>max)
                 max=right;
        }
        return max;
    }
    //搜索二叉树查找最大值
    public int FindMax(TNode mNode,int st){
        if (st != 1){
            throw new RuntimeException("标志请输入1，进行搜索树中的最大值查找");
        }
        TNode mNode1 = mNode;
        while (mNode1.right!=null){
            mNode1=mNode1.right;
        }
        return mNode1.value;
    }
    //普通二叉树查找某值
    public boolean FindOne(TNode mNode, int data) {
        Boolean temp;
        if (mNode == null) {
            return false;
        } else {
            if (mNode.value == data) {
                return true;
            } else {
                temp = FindOne(mNode.left, data);
                if (temp)
                    return temp;
                else {
                    temp = FindOne(mNode.right, data);
                    return temp;
                }
            }
        }
    }
//统计二叉树结点个数
    public int SizeTree(TNode mNode){
        if(mNode==null)
        {
            return 0;
        }else {
            return (SizeTree(mNode.right)+1)+(SizeTree(mNode.left)+1);
        }
    }

    //统计树的高度
    public int HeightTree(TNode mNode){
        int leftHeight,rightHeight;
        if (mNode==null)
        {
            return 0;
        }else {
            leftHeight=HeightTree(mNode.left);
            rightHeight=HeightTree(mNode.right);
            if (leftHeight>rightHeight)
                return leftHeight+1;
            else return rightHeight+1;
        }
    }

    TNode DeepTree(TNode mNode){
        TNode temp = null;
        Queue<TNode> queue = new LinkedList<TNode>();
        if (mNode == null) {
            return null;
        }
        queue.offer(mNode);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.left != null)
                queue.offer(temp.left);
            if (temp.right != null)
                queue.offer(temp.right);
            }
            return temp;
        }

    //树的直径
    static int diameter;
    int DiameterTree(TNode mNode, int diameter) {
        int left,right;
        if (mNode == null) {
            return 0;
        }
        right = DiameterTree(mNode.right,diameter);
        left = DiameterTree(mNode.left,diameter);
        if(left+right>diameter)
            diameter=left+right;
        return Math.max(left,right)+1;
    }
    //树的结点


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int a[] = {3, 4, 6, 1, 8, 2, 5};
        for (int i = 0; i < a.length; i++) {
            binaryTree.mNode = binaryTree.insert(binaryTree.mNode, a[i]);
        }
        binaryTree.inOrder(binaryTree.mNode);
        System.out.println();
        binaryTree.inOrder1(binaryTree.mNode);
    }

}
