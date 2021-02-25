package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的某些操作是受元素的equals方法影响的，例如contains，remove操作
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(1,2));
        System.out.println(c);

        Point p = new Point(1,2);
        /*
            boolean contains(Object o)
            判断当前集合是否包含给定元素，若包含则返回true
            判断的依据是看给定元素与集合现有元素是否存在equals比较为true的。有则认为包含
         */
        boolean contains = c.contains(p);
        System.out.println(contains);
        /*
            remove方法删除当前集合中与给定元素equals比较为true的元素。
            对于List集合而言，如果存在重复元素则只删除一次。
         */
        c.remove(p);
        System.out.println(c);







    }

}
