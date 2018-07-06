package DatasStr;
//     在实验室中进行数据更新与分析的例程，用于说明多线程并发问题。

class J_Experiment // 实验
{
    private int m_temperature, m_pressure; // 温度与气压
    public void mb_update(int t, int p) // 数据更新
    {
        m_temperature = t;
        m_pressure    = p;
    } // 方法mb_update结束
    
    public void mb_analyze( ) // 数据分析
    {
        int t= m_temperature;
        int p= m_pressure;
        for (int i=0; i<1000; i++) // 进行延时，使得并发问题更容易出现
            ;
        if (t!=m_temperature) // 分析温度数据
        {
            System.out.print("实验室出现情况：");
            System.out.println("t(" + t + ") != (" + m_temperature + ")");
            System.exit(0);
        } // if结构结束
        if (p!= m_pressure) // 分析气压数据
        {
            System.out.print("实验数据出现情况: ");
            System.out.println("p(" + p + ") != (" + m_pressure + ")");
            System.exit(0);
        } // if结构结束
    } // 方法mb_analyze结束
} // 类J_Experiment结束

class J_Assistant extends Thread // 实验室的助理人员
{
    J_Experiment m_data;
    
    public J_Assistant(J_Experiment d)
    {
        m_data= d;
    } // 构造方法J_Assistant结束

    public void run( )
    {
        int i, j;
        for(; true; )
        {
            i= (int)(Math.random( ) * 1000);
            j= (int)(Math.random( ) * 1000);
            m_data.mb_update(i, j);
        } // for循环结束
    } // 方法run结束
} // 类J_Assistant结束

class J_Analyst extends Thread // 实验室的分析人员
{
    J_Experiment m_data;
    
    public J_Analyst(J_Experiment d)
    {
        m_data= d;
    } // 构造方法J_Analyst结束
    
    public void run( )
    {
        for(; true; )
            m_data.mb_analyze( );
    } // 方法run结束
} // 类J_Analyst结束

public class J_Synchronization
{
    public static void main( String args[ ] )
    { 
        J_Experiment data= new J_Experiment( );
        J_Assistant threadA = new J_Assistant(data);
        J_Analyst   threadB = new J_Analyst(data);
        threadA.start( );
        threadB.start( );
    } // 方法main结束
} // 类J_Synchronization结束
