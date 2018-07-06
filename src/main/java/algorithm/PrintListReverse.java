package algorithm;
// 逆序输出链表
class ListNode {
          int val;
          ListNode next = null;

          ListNode(int val) {
              this.val = val;
          }
      }
  
public class PrintListReverse {


    public void printListFromTailToHead(ListNode listNode) {
        if (listNode !=null) {
            if (listNode.next != null) {
                printListFromTailToHead(listNode.next);
            }
        }
        System.out.println(listNode.val);

    }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        PrintListReverse printListReverse = new PrintListReverse();
        printListReverse.printListFromTailToHead(listNode1);
    }
}
