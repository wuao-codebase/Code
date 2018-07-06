package algorithm;

import java.util.Stack;

public class IsPopOrder1 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        if (pushA.length==0 && popA.length==0) {
            return false;
        }
        for (int i = 0,j=0; i < pushA.length; ) {
            stack.push(pushA[i++]);
            while (  !stack.isEmpty() && stack.peek()==popA[j] ){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
