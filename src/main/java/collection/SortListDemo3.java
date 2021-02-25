package collection;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        System.out.println(list);
        //Collections.sort(list);
        //按照字符多少排序
//        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        //降序
        Collections.sort(list,(s1,s2)->s2.length()-s1.length());
        System.out.println(list);











    }
}
