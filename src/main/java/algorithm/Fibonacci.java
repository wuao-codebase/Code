package algorithm;
//計算菲波那切數列
import java.util.LinkedList;

public class Fibonacci {
    public int FibN(int n){
        if (n<=0)
        {
            return 0;
        }
        if (n<3 && n>0){
            return 1;
        }
        int init = 1;
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.addFirst(init);
        integers.addFirst(init);
        for (int i = 0; i < n-2; i++) {
            int i1 = integers.pollLast() + integers.peekFirst();
            integers.addFirst(i1);
        }
        return integers.peekFirst();
    }

    public int FibN1(int n){
        int f=0,g=1;
        if (n<=0)
        {
            return 0;
        }
        while (n-->0){
            g+=f;
            f=g-f;
        }
        return f;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println( fibonacci.FibN1(2));
        System.out.println( fibonacci.FibN1(1));
        System.out.println( fibonacci.FibN1(3));
        System.out.println( fibonacci.FibN1(7));
    }
}
