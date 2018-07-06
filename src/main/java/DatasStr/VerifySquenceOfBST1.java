package DatasStr;

public class VerifySquenceOfBST1 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0) {
            return false;
        }
        return judge(sequence,0,sequence.length-1);

    }
    public boolean judge(int [] sequence,int l,int r){
        if(l >= r) return true;
        int cut=r;
        for (int i = r-1; i >=0; i--) {
            if (sequence[i]>sequence[r])
                cut=i;
            else break;
        }
        for (int i = 0; i < cut - 1; i++) {
            if (sequence[i]>sequence[r])
                return false;
        }
        return judge( sequence, l,cut-1)&&judge( sequence, cut,r-1);
    }

    public static void main(String[] args) {
        VerifySquenceOfBST1 verifySquenceOfBST1 = new VerifySquenceOfBST1();
        int [] a ={7,4,6,5};
        System.out.println( verifySquenceOfBST1.VerifySquenceOfBST(a));
    }
}
