package examples.train;

public class train1_3 {
    public static void main(String[] args) {
        short s = 1;
        char c = 'c';
        byte b = 2;

        print(s);
        print(+s);

        print(c);
        print(+c);

        print(b);
        print(+b);
    }

    public static void print(int i) {
        System.out.println("int:"+i);
    }

    public static void print(byte i) {
        System.out.println("byte:"+i);
    }

    public static void print(short i) {
        System.out.println("short:"+i);
    }

    public static void print(char i) {
        System.out.println("char:"+i);
    }
}
