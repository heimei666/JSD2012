package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合之间的操作
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        System.out.println("c1:"+c1);

        Collection c2 = new HashSet();
        c2.add("android");
        c2.add("ios");
        c2.add("java");
        System.out.println("c2:"+c2);

        /*
            boolean addAll(Collection c)
            将给定集合的所有元素添加到当前集合中，添加后当前集合发生了变化则返回true
         */
//        c1.addAll(c2);
//        System.out.println("c1:"+c1);

//        c2.addAll(c1);
//        System.out.println("c2:"+c2);
        /*
            下面操作是将c2当成一个元素添加到c1集合中。此时c1集合包含4个元素，上字符串类型
            元素和一个HashSet类型元素。因此并非将c2所有元素添加到了c1中。
         */
//        c1.add(c2);
//        System.out.println("c1:"+c1);

        Collection c3 = new ArrayList();
        c3.add("android");
        c3.add("c++");
//        c3.add("php");
        System.out.println("c3:"+c3);
        /*
            boolean containsAll（Collection c）
            判断当前集合是否包含给定集合中的所有元素，全包含则返回true
         */
        boolean containsAll = c1.containsAll(c3);
        System.out.println("全包含："+containsAll);
        /*
            下面操作是将c3看作一个元素看待，判断c1集合中是否有一个集合类型的元素c3
         */
//        boolean contains = c1.contains(c3);
//        System.out.println("全包含："+contains);
        /*
            删除当前集合中与给定集合的共有元素。
         */
        c1.removeAll(c3);
        System.out.println("c1:"+c1);//c1中与c3共有的元素被删除了
        System.out.println("c3:"+c3);//c3不受影响






    }
}
