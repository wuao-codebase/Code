package algorithm;
//赋值复杂链表
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class RandomListNode1 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode current = pHead;
        while (current != null) {
            RandomListNode cloneNode = new RandomListNode(current.label);
            cloneNode.next = current.next;
            current.next = cloneNode;
            current = cloneNode.next;
        }
        current = pHead;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        current = pHead;
        RandomListNode cloneHead = pHead.next;
        RandomListNode precurrent;
        while (current.next != null) {
            precurrent = current.next;
            current.next = precurrent.next;
            current = precurrent;
        }
        return cloneHead;
    }
}
