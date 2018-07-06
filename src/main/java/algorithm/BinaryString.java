package algorithm;

import java.util.Arrays;

//生成长度为n的所有二进制串
public class BinaryString {
    int[] A = new int[4];
    public void Binary(int n){
        if(n==1){
            System.out.println(Arrays.toString(A));
        }else {
            A[n-1]=0;
            Binary(n-1);
            A[n-1]=1;
            Binary(n-1);
        }
    }

    public static void main(String[] args) {
        Object o = new Object();

        BinaryString binaryString = new BinaryString();
        binaryString.Binary(4);
    }
}
