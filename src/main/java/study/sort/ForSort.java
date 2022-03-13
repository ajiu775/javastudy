package study.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: javastudy
 * @description: bubble sort implement
 * @author: Kelly.Xing
 * @create: 2020-03-21 20:45
 **/
public class ForSort {
    public static void main(String[] args) {
        int[] array = new int[]{8, 4, 2, 10, 9, 5, 13, 5};

        heapSort(array);
        System.out.println(Arrays.toString(array));

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

    /**
     * 快速排序
     */
    public static int[] quickSort(int[] array, int left, int right) {
        if (left < right) {
            int index = quickSortHelper(array, left, right);
            quickSort(array, left, index - 1);
            quickSort(array, index + 1, right);
        }
        return array;
    }

    public static int quickSortHelper(int[] array, int left, int right) {
        int base = array[left];
        while (left < right) {
            while (right > left && array[right] >= base) {
                right--;
            }
            array[left] = array[right];
            while (right > left && array[left] <= base) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = base;
        return left;
    }


    private static void heapSort(int[] arr) {
        //创建堆
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = arr.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            //重新对堆进行调整
            adjustHeap(arr, 0, i);
        }
    }

    /**
     * 调整堆
     * @param arr 待排序列
     * @param parent 父节点
     * @param length 待排序列尾元素索引
     */
    private static void adjustHeap(int[] arr, int parent, int length) {
        //将temp作为父节点
        int temp = arr[parent];
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && arr[lChild] < arr[rChild]) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= arr[lChild]) {
                break;
            }

            // 把孩子结点的值赋给父结点
            arr[parent] = arr[lChild];

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        arr[parent] = temp;
    }
}
