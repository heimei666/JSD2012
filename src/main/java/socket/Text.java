package socket;

import java.util.Arrays;

/**
 * 测试从数组中删除指定元素
 */
public class Text {
    public static void main(String[] args) {
        int[] allOut = {30,15,89,68,745,968,56,35,19,16};
        int pw = 968;
        System.out.println(Arrays.toString(allOut));
        //将pw从数组allOut中删除
        for (int i = 0; i < allOut.length; i++) {
            if (pw == allOut[i]){
                allOut[i] = allOut[allOut.length-1];
                allOut = Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }

        System.out.println(Arrays.toString(allOut));
    }
}
