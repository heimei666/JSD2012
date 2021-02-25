package map;

import java.util.HashMap;
import java.util.Map;

/**
 *  java.util.Map 查找表
 *  Map在java中是非常常用的一种数据结构，他的样子像是一个多行两列的表格。其中左列称为key
 *  右列称为value。Map总是根据key获取对应的value。
 *
 *  常用实现类：java.util.HashMap,散列表。当今查询速度最快的数据结构，使用散列算法实现
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        /*
            V put(K k,V v)
            将一组键值对存入到当前Map中。
            由于Map有一个要求：key不允许重复（使用key自身equals比较判定重复，与集合一致）
            因此如果使用已有的key存放value时则会替换value。返回值为被替换的value。
            如果key不存在，则正常存入Map，此时返回值为null。
         */
        /*
            当Map的Value类型是包装类时，获取该值应当使用包装类类型的变量接收，不要
            使用对应的基本类型变量接收，避免自动拆箱导致的空指针异常。
         */
        //int value = map.put("语文",99);//put返回值为null时自动拆箱会出现空指针异常
        Integer value = map.put("语文",99);
        System.out.println("value:"+value);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",99);
        System.out.println(map);

        value = map.put("语文",76);
        System.out.println(map);
        System.out.println(value);//语文这个key被替换的value：99

        /*
            V get(K k)
            根据给获取对应的value。如果给定的key不存在，则返回值为null
         */
        value = map.get("数学");
        System.out.println("数学："+value);
        value = map.get("体育");
        System.out.println("体育："+value);

        int size = map.size();
        System.out.println("size:"+size);

        /*
            V remove(Object key)
            删除当前Map中给定的key所对应的键值对，返回值为这个key对应的value
         */
        value = map.remove("数学");
        System.out.println(map);
        System.out.println(value);
        //判断Map中是否包含给定的key
        boolean ck = map.containsKey("英语");
        //判断Map中是否包含给定的value
        boolean cv = map.containsValue(96);
        System.out.println("包含key："+ck);
        System.out.println("包含value："+cv);

    }
}
