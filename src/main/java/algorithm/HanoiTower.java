package algorithm;

//汉诺塔问题
public class HanoiTower {
    public void move(int n,char from,char buffer,char to){
        if (n==1){
            System.out.println("Move:"+n+" from:"+from+" to:"+to);
            return;
        }
        move(n-1, from,to,buffer);
        move(1,from,buffer,to);
        move(n-1,buffer,from,to);
    }
    public static void main(String[] args) {
        HanoiTower hanoiTower = new HanoiTower();
        hanoiTower.move(3,'a','b','c');
    }
}
