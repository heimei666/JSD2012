package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 获取当前集合中指定范围内的子集
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        //获取集合当中3-7这部分子集
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        //将子集中每个元素扩大10倍
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i,subList.get(i)*10);
        }
        //[30,40,50,60,70]
        System.out.println(subList);
        /*
            对子集的操作就是对原集合对应元素的操作
         */
        System.out.println(list);
        //将list集合中的2-8删除
        list.subList(2,9).clear();
        System.out.println(list);






    }
}
