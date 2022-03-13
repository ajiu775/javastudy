package study.sort;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/4/18/22:56
 */
public class QuickSort {

    public void sort(int[] array,int low ,int high) {
        if(high>low){
            int index = quickSort(array, low, high);
            sort(array,low,index-1);
            sort(array,index+1,high);
        }
    }

    public int  quickSort(int[] array, int low, int high) {
        int flag = array[low];
        while(low<high){
            while (low < high && array[high] >= flag) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= flag) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = flag;
        return  low;
}

    public static void main(String[] args) {
        int[] array = new int[]{9,8,7,6,5,4,3,2,1};
        QuickSort quickSort = new QuickSort();
        int n =array.length-1;
        quickSort.sort(array,0,n);
        System.out.println(Arrays.toString(array));
    }
}
