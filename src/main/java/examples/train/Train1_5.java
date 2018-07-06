package examples.train;

public class Train1_5 {
    static int a = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("a = " + a);
        System.out.println(Integer.toBinaryString(a));
        short a1 = (short) Train1_5.a;
        System.out.println("a1 = " + a1);
        System.out.println(Integer.toBinaryString(a1));

    }
}
