package integer;

/**
 * 包装类常见功能
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        //获取int最大值
        int imax = Integer.MAX_VALUE;
        System.out.println("imax:"+imax);
        int imin = Integer.MIN_VALUE;
        System.out.println("imin:"+imin);

        long lmax = Long.MAX_VALUE;
        System.out.println("lmax:"+lmax);

        /*
            包装类提供了一个静态方法parseXXX(String line)
            可以将字符串解析为对应得基本类型数据。但是前提是该字符串
            正确描述了基本类型可以保存的值。否则会抛出异常：
            java.lang.NumberFormatException
         */
        String line = "123";
//        String line = "123.123";//这个字符串就不能转为int值！
        int in = Integer.parseInt(line);
        System.out.println(in);//123
        double dou = Double.parseDouble(line);
        System.out.println(dou);//123.0




    }
}
