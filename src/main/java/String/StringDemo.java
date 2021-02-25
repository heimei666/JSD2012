package String;

import java.nio.file.Watchable;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存所有使用字面量形式
 * 创建的字符串对象，当再次 使用相同字面量创建字符串时会直接重用常量池中的对象而不会再次
 * 创建新对象减少内存开销
 */

public class StringDemo {
    //运行代码快捷键：ctrl+shift+F10.或者点击main方法左侧行号处的三角图标运行。
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println("s1:"+s1);
        //s2字面量与s1相同，因此重用了上面s1创建的字符串对象
        String s2 = "123abc";
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);//s1==s2为true，说明保存的地址一样，使用的同一个对象

        String s3 = new String("123abc");
        System.out.println("s3:"+s3);
        System.out.println(s2==s3);//s2==s3为false，new很强制，一定创建新对象（不推荐）

        //比较字符串内容需要用equals！
        System.out.println(s2.equals(s3));//true,比较的是字符串对象的内容是否相同

        s1 = s1+"!";//由于字符串是不变对象，修改内容就会创建新的对象
        System.out.println("s1:"+s1);//s1内容发生了改变
        System.out.println("s2:"+s2);//s2的内容没有发生改变
        System.out.println(s1==s2);//false.s1已经不再和s2指向同一个对象了

        /*
            编译器有一个特性：
            当编译器在编译一段代码时发现一个计算表达式可以在编译期间确定结果时就会进行计算，并
            将结果编译到class文件中。这样一来虚拟机运行该程序时就不必每次都进行计算了。
            下面的代码会被编译器改为：
            String s4 = "123abc";
         */
        String s4 = "123"+"abc";
        System.out.println("s4:"+s4);
        System.out.println(s4==s2);

        String s = "123";
        String s5 = s+"abc";
        System.out.println("s5:"+s5);
        System.out.println(s5==s2);










    }
}
