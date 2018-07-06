package algorithm;
//链表的倒置
public class ReverseList1 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next==null)
            return head;
        ListNode reversehead=ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reversehead;
    }

    public static void main(String[] args) {
        ReverseList1 reverseList1 = new ReverseList1();
        reverseList1.ReverseList(null);
    }
}
