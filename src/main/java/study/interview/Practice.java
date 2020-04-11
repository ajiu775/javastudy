package study.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: javastudy
 * @description: for puffa
 * @author: Kelly.Xing
 * @create: 2020-03-21 19:56
 **/
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!scanner.hasNext("end")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.add(a + b);
        }
        for (Integer result : list) {
            System.out.println(result);

        }
        scanner.close();
    }
}
