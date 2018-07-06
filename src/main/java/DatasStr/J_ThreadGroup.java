package DatasStr;

public class J_ThreadGroup {
    public static void main(String[] args) {
        System.out.println("方法main所在的线程组含有");
        System.out.println(Thread.activeCount() + "个线程");
        Thread t = Thread.currentThread(); //获得当前线程
        ThreadGroup tg = t.getThreadGroup(); //获得当前线程组
        for (; tg!=null; tg=tg.getParent())
        {
            System.out.println("线程组 = " + tg.getName());
            System.out.println("含有");
            System.out.println(tg.activeCount() + "个线程");
            int n = tg.activeCount();
            Thread[] tList = new Thread[n];
            int m = tg.enumerate(tList);
            for (int i = 0; i < m; i++) {
                System.out.println("    其中第 = " + (i+1) + "个线程名为"
                + tList[i].getName());
                //Monitor Ctrl-Break
                //Attach Listener      添加事件
                //Signal Dispatcher   分发处理给JVM信号的线程
                //Finalizer           调用对象finalize方法的线程
                //Reference Handler   清除reference线程
                //main   main线程,程序入口
            }
        }
    }
}
