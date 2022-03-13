package study;

import com.mysql.cj.util.StringUtils;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/4/4/16:18
 */
public class Test {
    private static int b = 0;

    public static void main(String[] args) {
    }

    public int divide(int a, int b) {
        //边界条件 a的最大值除以-1会导致溢出
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        //用来计数
        long i = 0;
        //标识结果的正负数
        boolean sign = true;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            sign = false;
        }
        //取绝对值
        a = Math.abs(a);
        b = Math.abs(b);
        while ((a >> 1 - b) > 0) {
            a = a >> 1;
            i = i << 1;
        }
        i = i + 1;
        if (!sign) {
            i = 0 - i;
        }

        if (i > Integer.MAX_VALUE || i < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) i;
    }


}