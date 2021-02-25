package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承自Collection，是集合中最常用的一类集合。特点是：可以存放重复元素并且有序。
 * List中定义了一套可以通过下标操作元素的方法，使用更方便。
 *
 * List常用实现类：
 * java.util.ArrayList:内部使用数组实现，查询性能更好
 * java.util.LinkedList:内部使用链表实现，增删性能更好
 * 在没有对集合对应性能有非常严苛的要求时，通常首选使用ArrayList。
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            E get(int index)
            获取当前集合中指定下标处对应的元素
         */
        String str = list.get(0);//获取集合中第一个元素
        System.out.println(str);

        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            System.out.println(str);
        }

        /*
            E set(int index,E e)
            将给定元素设置到指定位置，返回值为该位置原有元素
            相当于是替换现有元素操作
         */
        //[one,2,three,four,five]
        String old = list.set(1,"2");
        System.out.println(list);
        System.out.println(old);//被替换的元素two
        /*
            在不创建新集合的前提下，将集合元素反转
            利用get,set方法实现
         */
        for (int i = 0; i < list.size()/2; i++) {
            //获取正数位置上的元素
            old = list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i,old);
        }
        //[five,four,three,2,one]
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }

}
