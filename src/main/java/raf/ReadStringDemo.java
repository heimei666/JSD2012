package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(
                "raf.txt","r");
        byte[] data = new byte[(int) raf.length()];

        raf.read(data);//一次性将文件所有字节读入数组

        //String的构造方法允许将给定的字节数组内容按照指定字符集还原文字
        String line = new String(data,"UTF-8");
        System.out.println(line);

        raf.close();











    }
}
