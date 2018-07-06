package DatasStr;//     利用wait和notify成员方法进行线程同步的例程。

class J_Experiment4
{
    private int m_temperature, m_pressure;
    private boolean m_ready=false;
    
    public synchronized void mb_update(int t, int p)
    {
        System.out.println("进入更新方法内部:");
        if (m_ready) // 前面更新的数据还没有被处理
        {
            System.out.println("    等待数据分析完成...");
            try
            {
                wait( ); // 等待数据分析
            }
            catch(Exception e)
            {
                e.printStackTrace( );
                System.err.println(e);
            } // try-catch结构结束
            System.out.println("    继续更新数据...");
        } // if语句结束
        m_temperature = t;
        m_pressure    = p;
        System.out.println("更新完成: 温度值为" + t + ", 气压值为" + p);
        m_ready=true;
        notify( );
    } // 同步方法mb_update结束
    
    public synchronized void mb_analyze( )
    {
        System.out.println("进入数据分析方法内部:");
        if (!m_ready) // 数据还没有更新
        {
            System.out.println("    等待数据更新完成...");
            try
            {
                wait( ); // 等待数据更新
            }
            catch(Exception e)
            {
                e.printStackTrace( );
                System.err.println(e);
            } // try-catch结构结束
            System.out.println("    继续分析数据...");
        } // if语句结束
        int t= m_temperature;
        int p= m_pressure;
        System.out.println("分析完成: 温度值为" + t + ", 气压值为" + p);
        m_ready=false;
        notify( );
    } // 同步方法mb_analyze结束
} // 类J_Experiment4结束

class J_Assistant1 extends Thread
{
    J_Experiment4 m_data;
    
    public J_Assistant1(J_Experiment4 d)
    {
        m_data= d;
    } // 构造方法J_Assistant1结束

    public void run( )
    {
        System.out.println("助理线程开始工作");
        int i, j, k;
        for(k=0; k<3; k++)
        {
            i= (int)(Math.random( ) * 1000);
            j= (int)(Math.random( ) * 1000);
            m_data.mb_update(i, j);
        } // for循环结束
        System.out.println("助理线程结束工作");
    } // 方法run结束
} // 类J_Assistant1结束

class J_Analyst1 extends Thread
{
    J_Experiment4 m_data;
    
    public J_Analyst1(J_Experiment4 d)
    {
        m_data= d;
    } // 构造方法J_Analyst1结束
    
    public void run( )
    {
        System.out.println("分析员线程开始工作");
        for(int k=0; k<3; k++)
            m_data.mb_analyze( );
        System.out.println("分析员线程结束工作");
    } // 方法run结束
} // 类J_Analyst1结束

public class J_WaitNotify
{
    public static void main( String args[ ] )
    { 
        J_Experiment4 data= new J_Experiment4( );
        J_Assistant1 threadA = new J_Assistant1(data);
        J_Analyst1   threadB = new J_Analyst1(data);
        threadA.start( );
        threadB.start( );
        System.out.println("方法main结束");
    } // 方法main结束
} // 类J_WaitNotify结束
