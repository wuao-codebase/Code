package DatasStr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void bubbleSort1(int[] a, int n) {
        int i, j;
        for (i = n - 1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a < 0) return;
        ArrayList[] work = new ArrayList[a];
        for (int i = 0; i < a; i++) {
            int b = in.nextInt();
            ArrayList ints = new ArrayList(2 * b);
            for (int j = 0; j < b; j++) {
                ints.add(in.nextInt());
            }
            work[i] = ints;
        }
        for (int k = 0; k < a; k++) {
            ArrayList arrayList = work[k];
            int nem[] = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                int o = (int) arrayList.get(i);
                nem[i] = o;
            }
            bubbleSort1(nem, nem.length);
            int length = nem.length;
            if (length % 2 == 0) {
                if (nem[length / 2] == nem[length / 2 - 1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                if (nem[length / 2] == nem[length / 2 - 1] || nem[length / 2] == nem[length / 2 + 1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }

            }
        }

    }
}