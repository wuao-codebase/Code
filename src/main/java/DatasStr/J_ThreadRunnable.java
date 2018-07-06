package DatasStr;

public class J_ThreadRunnable implements Runnable {
//    通过接口实现避免多重继承
    private int m_threadID;

    public J_ThreadRunnable(int i) {
        m_threadID = i;
        System.out.println("创建线程 = " + i);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("运行线程 = " + m_threadID);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                System.out.println("异常interruptedException = " + e);
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new J_ThreadRunnable(1));
        t1.setPriority(10);
        System.out.println(t1.getName()+"优先级:"+t1.getPriority());
        t1.start();
        Thread t2 = new Thread(new J_ThreadRunnable(2));
        t2.start();
        System.out.println("方法main结束");
    }
}
