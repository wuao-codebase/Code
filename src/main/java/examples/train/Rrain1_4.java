package examples.train;

public class Rrain1_4 {
    public String a ="123";
    public String b =new String("123");
    public String c = "123";

    public static void main(String[] args) {
        Rrain1_4 train1_4 = new Rrain1_4();
        Rrain1_4 train1_42 = new Rrain1_4();
        System.out.println(train1_4.a == train1_42.c);
        System.out.println(train1_4.a.equals(train1_42.c) );
    }
}
