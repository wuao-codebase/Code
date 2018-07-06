package DatasStr;

public class J_ThreadDaemond extends Thread {
    @Override
    public void run() {
        for (int i = 0; true; i++) {
            System.out.println("线程在运行： " + i);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println("异常interruptedException = " + e);
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        J_ThreadDaemond t = new J_ThreadDaemond();
//        t.setDaemon(true);
        t.start();
        if (t.isDaemon()) {
            System.out.println("创建一个后台线程");
        } else {
            System.out.println("创建一个用户线程");
        }
        System.out.println("方法main结束");
    }
}
