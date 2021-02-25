package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录中的所有子项并输出
        File dir = new File(".");
        /*
            boolean isFile()
            判断当前File表示的是否为一个文件

            boolean isDrirectory()
            判断当前File表示的是否为一个目录
         */
        if (dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}
