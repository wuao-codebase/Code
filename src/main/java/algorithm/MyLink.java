package algorithm;
//带表头的链表
public class MyLink<T> {
    private Node<T> head;
     class Node<T>{
        public Node<T>  nextNode;
        public T value;

        public Node(Node nextNode,T value) {
            this.nextNode = nextNode;
            this.value = value;
        }
    }
    //初始化链表
    public MyLink(){
        head = new Node<T>(null,null);
    }
    //获得链表长度
    public int getCount(Node<T> head){
        int count = 0;
        Node<T> indexNode = head.nextNode;
        while (indexNode!=null) {
            count++;
            indexNode = indexNode.nextNode;
        }
        return count;
    }
    //查找第index个节点
    public Node<T> getNode(int index){
        int count = getCount(head);
        if (index<0||index>count)
            throw new IndexOutOfBoundsException();
        Node<T> indexNode = this.head;
        for (int i = 0; i < index; i++) {
            indexNode = indexNode.nextNode;
        }
        return indexNode;
    }
    //头插
    public void firstAdd(T value){
        Node<T> newNode = new Node<T>(head.nextNode,value);
            head.nextNode=newNode;
    }
    //尾插
    public void lastAdd(T value){
        int count = getCount(head);
        Node<T> indexNode = getNode(count);
        Node<T> newNode = new Node<T>(null,value);
        indexNode.nextNode=newNode;
    }
    //任意位置插入
    public void indexAdd(int index, T value){
        int count = getCount(head);
        if (index<1||index>count+1)
            throw new IndexOutOfBoundsException();
        if (index==1) {
            firstAdd(value);
        }else {
            Node<T> indexNode = getNode(index-1);
            Node<T> newNode = new Node<T>(indexNode.nextNode,value);
            indexNode.nextNode=newNode;
        }
    }
    public void indexDelete(int index){
        int count = getCount(head);
        if (index<1||index>count)
            throw new IndexOutOfBoundsException();
        if (index==1) {
            Node<T> temp = head.nextNode;
            head.nextNode=temp.nextNode;
            temp=null; //实际不需要
        }else {
            Node<T> prevNode = getNode(index-1);
            Node<T> temp = prevNode.nextNode;
            prevNode.nextNode=temp.nextNode;
            temp=null; //实际不需要
        }
    }
    public  void reverse(Node head){
        if (head == null||head.nextNode==null||head.nextNode.nextNode==null) {
            return ;
        }
        Node indeNode = head.nextNode.nextNode;  //第二个结点
        head.nextNode.nextNode=null;  //第一个结点指针域置空
        Node temp;
        while (indeNode!=null){
            temp = indeNode.nextNode; //第三个节点存为临时结点
            indeNode.nextNode = head.nextNode;  //第二个结点指针域指向第一个结点
            head.nextNode = indeNode;    //表头指向第二个结点，
            indeNode = temp;
        }
    }


    //打印链表
    public void printLink(Node<T> head){
        Node indexNode = head.nextNode;
        while (indexNode!=null)
        {
            System.out.print(indexNode.value+" ");
            indexNode = indexNode.nextNode;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        MyLink<Integer> myLink = new MyLink<Integer>();
        myLink.firstAdd(3);
        myLink.firstAdd(4);
        myLink.lastAdd(5);
        myLink.indexAdd(1,2);
        myLink.indexAdd(5,6);
        myLink.indexAdd(3,6);
        myLink.printLink(myLink.head);
    }
}
