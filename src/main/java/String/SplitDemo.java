package String;

/**
 * String支持正则表达式方法之二：
 *
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以
 * 一个String数组形式返回。
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "abc123def456ghi789jkl";
        //按照数字部分拆分
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*
            当遇到连续出现可拆分项时，中间会拆分出一个空字符串。
            如果字符串最开始就是可拆分项，则拆分后的第一项的、是空字符串。

            注意：如果字符串末尾连续出现可拆分项，所有拆分出来的空字符串
            会被忽略！
         */
        str = "123,,456,789";
        //按照"",""拆分
        arr = str.split(",");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }








    }
}
