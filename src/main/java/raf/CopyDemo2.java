package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量减少实际读写的次数可以提高读写效率。
 * 单字节读写是随机读写
 * 一组字节读写是块读写
 * 对于机械硬盘而言，单字节读写几乎没有效率可言，块读写效率很好。
 * 对大部分硬盘而言，减少硬盘调用次数都可以提高效率。
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("image.jpg","r");
        RandomAccessFile desc = new RandomAccessFile("image_cp.jpg","rw");

        /*
            RAF提供的块读写方法：
            块写：
            void write（byte[] data)
            一次性将给定的字节数组中所有字节写入文件

            void write(byte[] data,int offset,int len)
            一次性将给定数组中从下标offset处开始连续len个字节
            写入文件

            块读：
            int read(byte[] data)
            一次性从文件中读取给定的字节数组data总长度的字节量并将
            读取到的字节顺序存入到该数组中。返回值为实际读取到的
            字节量。如果返回值为-1则表示读取到文件末尾

            文件数据：
            11011010 00110101 01110101 11010010 01100010

            块读操作：
            byte[] data = new byte[6];//6字节的数组
            data：[00000000 00000000 00000000 00000000 00000000 00000000]
            int len = raf.read(data);
            data[11011010 00110101 01110101 11010010 01100010]
            len:5//read方法返回值为5，说明本次实际只读写到5个字节
            与单字节读取区别：
            int d = raf.read();//读取一个字节，返回值就是实际读取的字节数据
            d：00000000 00000000 00000000 11011010//该字节放在低八位上
         */
        int len;//记录每次块读写数据后，实际获取到的字节数
        /*
            00000000 8位2进制 1byte 1字节
            1024byte 1kb
            1024kb   1mb
            1024mb   1gb
            1024gb   1tb
         */
        byte[] data = new byte[1024*10];//10kb
        long start = System.currentTimeMillis();
        while ((len = src.read(data))!=-1){//读10kb
            desc.write(data,0,len);//读了多少字节就一次写多少字节
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时"+(end-start)+"ms");
        src.close();
        desc.close();























    }
}
