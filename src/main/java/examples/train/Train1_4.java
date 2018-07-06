package examples.train;

public class Train1_4 {
    static int a=-8;

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(a));
        a=a >>>2;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);

    }
}
