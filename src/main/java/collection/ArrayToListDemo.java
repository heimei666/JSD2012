package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类：Arrays提供了一个静态方法asList，可以将当前数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        List<String> list = Arrays.asList(array);
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);

        //将集合第二个换成“2”
        list.set(1,"2");
        System.out.println("list:"+list);
        //对集合的操作就是对原数组的操作
        System.out.println("array:"+Arrays.toString(array));
        /*
            由于数组是定长的，因此该数组转换出来的集合是不能做增删元素操作的，否则会抛出
            异常：java.lang.UnsupportedOperationException
         */
//        list.add("six");

        //如果希望对集合做增删操作，则需要自行创建一个新集合
//        List<String> list1 = new ArrayList<>();
//        list1.addAll(list);
        /*
            所有的集合都支持一个参数为Collection的构造方法，作用是在创建当前集合的同时
            包含给定集合中的所有元素。下面创建list1集合的操作等同上面两句。
         */
        List<String> list1 = new ArrayList<>(list);
        System.out.println("list1:"+list1);
        list1.add("six");
        System.out.println("list1:"+list1);
    }
}
