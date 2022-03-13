package study.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: java study
 * @description: bubble sort implement
 * @author: Allen
 * @create: 2020-03-21 20:45
 **/
public class ForSort {
    public static void main(String[] args) {
        System.out.print("请输入要排序的数组：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int[] array = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            array[i] = Integer.valueOf(inputs[i]);
        }
        System.out.println(Arrays.toString(bubble(array)));
    }

    /**
     * 冒泡排序
     **/
    public static int[] bubble(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public static int[] quickSort(int[] array) {
        int length = array.length;
        int flag = array[length - 1];
        return array;
    }

}
