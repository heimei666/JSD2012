package exception;

import java.io.*;

/**
 *  JDK7之后，java推出了一个新的特性：自动关闭。
 */
public class AutocloseableDemo {
    public static void main(String[] args) {
        //try后面的（）中初始化的类必须实现Autocloseable接口
        try (
                /*
                    编译器便以后会将try（）里初始化的类在finally中调用close
                    编译后的代码相当于是FinallyDemo2的样子
                 */
                FileOutputStream fos
                        = new FileOutputStream("fos.dat");
//                流连接初始化写法
//                PrintWriter pw =new PrintWriter(
//                        new BufferedWriter(
//                                new OutputStreamWriter(
//                                        new FileOutputStream("")
//                                )
//                        )
//                );
                ){
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }

















    }
}
