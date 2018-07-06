package algorithm;
//输出链表倒数第k个数
public class FindKthToTail1 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode pre=head;
        ListNode last=head;
        if (head==null||k<=0)
            return null;
        for (int i = 0; i < k; i++) {
            if (head.next!=null)
                pre = head.next;
            else return null;
        }
        while (pre.next!=null){
            pre = head.next;
            last=last.next;
        }
        return last;
    }
}
