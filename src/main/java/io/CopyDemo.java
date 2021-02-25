package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
            1:创建文件输入流读取原文件
            2：创建文件输入流写入复制文件
            3：循环块读写完成复制
            4：关闭两个流
         */
        FileInputStream fos = new FileInputStream("fos.txt");
        FileOutputStream fos1 = new FileOutputStream("fos_cp.txt");
        byte[] data = new byte[1024*10];//10kb
        int len;
        while ((len = fos.read(data))!=-1){//读10kb
            fos1.write(data,0,len);//读了多少字节就一次写多少字节
        }
        System.out.println("完成复制！");
        fos.close();
        fos1.close();
    }
}
