package String;

/**
 * boolean startsWith(String str)
 * 判断字符串是否是以给定的字符串开始的
 *
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串结尾的
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.com";

        //判断str是否以"www"开始的
        boolean starts = str.startsWith("www");
        System.out.println("starts:"+starts);

        //判断str是否以".cn"结尾的
        boolean ends = str.endsWith(".cn");
        System.out.println("ends:"+ends);










    }
}
