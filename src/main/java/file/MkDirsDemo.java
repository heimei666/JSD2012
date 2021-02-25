package file;

import java.io.File;

/**
 * 创建一个多级目录
 */
public class MkDirsDemo {
    public static void main(String[] args) {
        //在当前目录下新建目录a/b/c/d/e/f
        File dir = new File("./a/b/c/d/e/f");
        if (dir.exists()) {
            System.out.println("该目录已存在！");
        }else{
            /*
                与mkdir方法的区别是mkdirs会将所有不存在的父目录
                自动创建出来。而mkdir则不会，如果父目录不存在则
                创建不成功。
             */
            dir.mkdirs();
            System.out.println("目录已创建！");
        }
    }
}
