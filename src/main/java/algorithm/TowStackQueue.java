package algorithm;

import java.util.Stack;
//两个栈实现队列“先进先出”
public class TowStackQueue {
    private Stack<Integer> pushStack;
    private Stack<Integer> pollStack;

    public TowStackQueue(){
        pollStack=new Stack<Integer>();
        pushStack=new Stack<Integer>();
    }
    public void add(int newNum){
        pushStack.push(newNum);
    }
    public int poll(){
        if (pushStack.empty()&&pollStack.empty()) {
            throw new RuntimeException("pushStack为空");
        }else if (pollStack.empty())
        while (!pushStack.empty())
        {
            pollStack.push(pushStack.pop());
        }
        return pollStack.pop();
    }
    public int peek(){
        if (pushStack.empty()&&pollStack.empty()) {
            throw new RuntimeException("pushStack为空");
        }else if (pollStack.empty())
            while (!pushStack.empty())
            {
                pollStack.push(pushStack.pop());
            }
        return pollStack.peek();
    }

    public static void main(String[] args) {
        TowStackQueue towStackQueue = new TowStackQueue();
        towStackQueue.add(2);
        towStackQueue.add(4);
        towStackQueue.add(6);
        towStackQueue.add(7);
        System.out.println(towStackQueue.peek());
        System.out.println(towStackQueue.poll());
        System.out.println(towStackQueue.peek());
    }
}
