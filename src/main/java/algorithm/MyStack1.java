package algorithm;

import java.util.Stack;
//两个栈实现查询栈最小值
public class MyStack1 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;
    public MyStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    public void push(int newNum){
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        }else if(this.min()>=newNum){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("stackData为空");
        }
        int oneNum = this.stackData.pop();
        if (oneNum==this.min())
        {
            this.stackMin.pop();
        }
        return oneNum;
    }

    public Integer min(){
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("stackMin为空");
        }
        return  this.stackMin.peek();
    }

    public static void main(String[] args) {
        MyStack1 myStack1 = new MyStack1();
        myStack1.push(2);
        myStack1.push(4);
        myStack1.push(7);
        myStack1.push(1);
        myStack1.pop();
        System.out.println(myStack1.min());
    }
}
