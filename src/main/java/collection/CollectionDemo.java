package collection;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JAVA 集合框架
 * java.util.Collection接口，是所有集合的顶级接口，里面定义了集合都应当具备的功能。
 * 集合与数组一样，可以保存一组元素，并且对于元素的操作都以方法的形式提供出来。使用方便。
 * 并且集合有多种不同的数据结构可供选择。
 *
 * Collection下面有两个常见的子接口：
 * java.util.List:线性表，这类集合的特点是可以存放重复元素，并且有序。
 *                常用实现类：java.util.ArrayList,java.util.LinkedList
 * java.util.Set:这类集合的特点是不能存放重复元素。
 *               常见实现类：java.util.HashSet
 * 重复元素的判定标准为元素自身equals方法比较的结果。为true则认为是重复元素。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        /*
            boolean add(E e)
            向当前集合中添加给定元素，成功添加则返回true
            集合只能存放引用类型元素，如果指定元素是基本类型时编译器会进行自动装箱
            为包装类。
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /*
            int size()
            返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:"+size);

        /*
            boolean isEmpty()
            判断当前集合是否为空集
            当集合的size为0时，返回true
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集："+isEmpty);

        c.clear();//清空集合
        System.out.println(c);
        System.out.println("size:"+c.size());
        System.out.println("是否为空集："+c.isEmpty());


















    }
}
