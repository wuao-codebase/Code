package DatasStr;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
        if (a<0) return;
        long[][] work = new long[a][5];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                work[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            long sum = 0;
            for (int j = 0; j < 5; j++) {
                sum=work[i][j]+sum;
            }
            if (sum % 5==0){
                System.out.println(sum/5);
            }else {
                System.out.println("-1");
            }
        }
    }
}