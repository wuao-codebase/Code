package algorithm;

public class JumpFloor {

    public int Jump(int target) {
            if (target <= 0) {
                return -1;
            }
            else if(target == 1) {
                return 1;
            }
            else if(target == 2) {
                return 2;
            } else{
                int f=0,g=1;
                while (target-->=0){
                    g+=f;
                    f=g-f;
                }
                return f;
            }
        }

    public static void main(String[] args) {
        JumpFloor jumpFloor = new JumpFloor();
        System.out.println(jumpFloor.Jump(5));
    }
    }
