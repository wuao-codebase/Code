package algorithm;

import java.util.NoSuchElementException;

public class LLQueue {
    private QNode frontNode;
    private QNode rearNode;

    private LLQueue() {
        QNode frontNode = null;
        QNode rearNode = null;

    }

    private class QNode {
        private QNode NextNode;
        Integer value;

        public QNode(QNode nextNode, Integer value) {
            this.NextNode = nextNode;
            this.value = value;
        }
    }

    public void enQueue(Integer value) {
        QNode indexQNode = new QNode(null, value);
        if (rearNode != null) {
            rearNode.NextNode = indexQNode;
        }
        rearNode = indexQNode;
        if (frontNode == null) {
            frontNode = rearNode;
        }
    }
    public int deQueue(){
        if (frontNode == null) {
            throw new NoSuchElementException();
        }
        int data = frontNode.value;
        frontNode = frontNode.NextNode;
        return data;
    }

    public void prinft(QNode frontNode) {
        QNode frontNode1 = frontNode;
        if (frontNode == null) {
            return;
        }
        while (frontNode1 != null) {
            System.out.print(frontNode1.value);
            frontNode1 = frontNode1.NextNode;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LLQueue llQueue = new LLQueue();
        llQueue.enQueue(2);
        llQueue.enQueue(3);
        llQueue.enQueue(4);
        llQueue.prinft(llQueue.frontNode);
        llQueue.deQueue();
        llQueue.prinft(llQueue.frontNode);
        llQueue.enQueue(2);
        llQueue.prinft(llQueue.frontNode);
    }
}
