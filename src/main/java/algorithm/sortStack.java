package algorithm;

import java.util.Stack;

public class sortStack {

    public void sortStackByStack(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()){
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek()<cur)
            {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty())
        {
            stack.push(help.pop());
        }


    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        sortStack sortStack = new sortStack();
        sortStack.sortStackByStack(stack);
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }

    }
}
