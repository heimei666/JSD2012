package collection;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合只能存放引用类型元素，并且存放的是元素的引用（地址）
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        Collection c = new ArrayList();
        c.add(p);//将p存入集合

        System.out.println("p:"+p);//(1,2)
        System.out.println("c:"+c);//[(1,2)]

        p.setX(2);
        System.out.println("p:"+p);//(2,2)
        System.out.println("c:"+c);//[(?,2)]











    }
}
