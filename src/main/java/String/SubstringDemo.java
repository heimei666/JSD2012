package String;

/**
 * String substring(int start,int end)
 * 截取指定范围内的字符串。；两个参数分别是范围对应得下标。
 * 注：在Java API中通常使用两个数字表示范围时都是“含头不含尾”的。
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";
        //截取域名
        String sub = host.substring(4,8);
        System.out.println(sub);

        //重载的substring传入一个参数为：从指定位置截取到字符串末尾
        sub = host.substring(4);
        System.out.println(sub);















    }
}
