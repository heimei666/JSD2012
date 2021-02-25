package io;

import java.io.*;
import java.util.Scanner;

/**
 *  简易记事本功能
 *  程序启动后要求用户输入文件名，然后对文件进行写操作。
 *  之后用户输入的每一行字符串都要按行写入到文件中。
 *  当用户单独输入exit时程序退出。
 *
 *  要求：创建PrintWriter并且自行创建流连接完成。
 *
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String fileName = scanner.nextLine();
        FileOutputStream fos
                = new FileOutputStream(fileName);
        OutputStreamWriter osw
                = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw
                = new BufferedWriter(osw);
        /*
            当创建PW时第一个参数为流，则可以在传入一个boolean型的参数
            如果这个值为true，则当前PW具有自动行刷新功能。即：
            每当我们调用println方法后会自动flush
         */
        PrintWriter pw
                = new PrintWriter(bw,true);
        System.out.println("请开始输入内容，单独输入exit退出");
        while (true){
            String line = scanner.nextLine();
            if ("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见！");










    }
}
