package algorithm;

//找出旋转数组最小数
public class minNumberInRotateArray {
    public int  minNumber(int [] rotateArray){
        if(rotateArray.length==0){
            return 0;
        }
        int left = 0;
        int right = rotateArray.length-1;
        int min = 0;
        while(rotateArray[left]>=rotateArray[right]){
            min=(left+right)/2;
            if(right-left==1){
                min=right;
                break;
            }
            if(rotateArray[left]==rotateArray[min]&&rotateArray[left]==rotateArray[right]){
                OrderFind(rotateArray,left,right);
            }
            if(rotateArray[min]>=rotateArray[left]){
                left=min;
            }else {
                right=min;
            }
        }
        return rotateArray[min];
    }

    private int OrderFind(int [] rotateArray,int left,int right) {
        int min = rotateArray[left];
        for (int i = 0; i < rotateArray.length; i++) {
            if (rotateArray[i]<min){
                min=rotateArray[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array =  {};
        minNumberInRotateArray minNumberInRotateArray = new minNumberInRotateArray();
        System.out.println(minNumberInRotateArray.minNumber(array));
    }

}
