package algorithm;

import java.util.EmptyStackException;

public class LLStack {
    private LLNode Lhead;

    public LLStack(){
        LLNode Lhead = new LLNode(null,null);
    }

    private  class LLNode {
        private LLNode NextNode;
        Integer value;

        public LLNode(LLNode nextNode, Integer value) {
            this.NextNode = nextNode;
            this.value = value;
        }
    }

    public void push(Integer value) {
        if (Lhead == null) Lhead = new LLNode(null, value);
        else if (Lhead.value == null) {
            Lhead = new LLNode(null, value);
        } else {
            LLNode indexNode = new LLNode(Lhead, value);
            Lhead = indexNode;
        }
    }
    public int pop(){
        if (Lhead == null) {
            throw new EmptyStackException();
        }else{
            Integer value = Lhead.value;
            Lhead=Lhead.NextNode;
            return value;
        }
    }
    public void print(LLNode lhead){
        LLNode lhead1 = Lhead;
        if (lhead1 == null) {
            throw new EmptyStackException();
        }
        while (lhead1!=null)
        {
            System.out.print(lhead1.value);
            lhead1 = lhead1.NextNode;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LLStack llStack = new LLStack();
        llStack.push(1);
        llStack.push(2);
        llStack.push(3);
        llStack.print(llStack.Lhead);
        llStack.pop();
        llStack.print(llStack.Lhead);

    }
}
