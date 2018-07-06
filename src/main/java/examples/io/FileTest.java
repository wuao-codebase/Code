package examples.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileTest {
    public static void main(String[] args) {

        FileOutputStream out = null;
        FileOutputStream outSTr = null;
        BufferedOutputStream Buff = null;
        FileWriter fw = null;

        int count = 10000;

        try {
            out = new FileOutputStream(new File("E:\\test1.txt"));
            for (int i = 0; i < count; i++) {
                out.write("测试java 文件操作\r\n".getBytes());
            }
            out.close();

            outSTr = new FileOutputStream(new File("E:\\test2.txt"));
            Buff = new BufferedOutputStream(outSTr);
            for (int i = 0; i < count; i++) {
                Buff.write("测试java 文件操作\r\n".getBytes());
            }
            Buff.flush();
            Buff.close();

            fw = new FileWriter("E:\\test2.txt");
            for (int i = 0; i < count; i++) {
                fw.write("测试java 文件操作\r\n");
            }
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (Buff != null) {
                    Buff.close();
                }
                if (outSTr != null) {
                    outSTr.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
