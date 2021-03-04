package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射机制调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.sayHello();


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名：");
        String className = scanner.nextLine();
        System.out.println("请输入方法名：");
        String method = scanner.nextLine();

        //反射
//        Class cls = Class.forName("reflect.Person");
        Class cls = Class.forName(className);
        //实例化
        Object o = cls.newInstance();//new Person

//        Method m = cls.getMethod("sayHello");
        Method m = cls.getMethod(method);
        m.invoke(o);//p.sayHello()
    }
}
