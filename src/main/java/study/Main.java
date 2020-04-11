package study;

import java.util.Arrays;

/**
 * @program: java study
 * @description: exam
 * @author: Kelly.Xing
 * @create: 2019-08-14 19:11
 **/
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{9, 2, 1, 3, 8, 6};
        Arrays.sort(a);
        for (int result : a) {
            System.out.print(result);
        }


    }
}