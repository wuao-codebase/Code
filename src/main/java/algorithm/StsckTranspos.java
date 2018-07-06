package algorithm;

import java.util.Stack;
//递归实现栈的倒叙
public class StsckTranspos {
    private Stack<Integer> Mystack;

    public StsckTranspos(){
        Mystack=new Stack<Integer>();
    }

    public static int getlast(Stack<Integer> Mystack) {
        Integer result = Mystack.pop();
        if (Mystack.empty())
        {
            return result;
        }else {
            int last = getlast(Mystack);
            Mystack.push(result);
            return last;
        }
    }

    public static void resives(Stack<Integer> Mystack) {
        if (Mystack.empty()) {
            return;
        }
        int i = getlast(Mystack);
        resives(Mystack);
        Mystack.push(i);
    }
    public static void main(String[] args) {

    }
}
