package reflect;

import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Person p = new  Person();//硬编码形式实例化：new + 构造方法（）
        System.out.println(p);

        /*
            java.util.Date 日期类
         */
        //1加载要实例化类的类对象
//        Class cls = Class.forName("reflect.Person");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入类名：");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);
        //2通过类对象实例化
        Object o = cls.newInstance();//表示的类必须有无参构造器
        System.out.println(o);
    }
}
