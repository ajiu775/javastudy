package study.sort;

import java.util.Arrays;

public class Main {
    private  static  int [] a = new int[]{9,8,7,6,5,4,3,2,1};
    public static void main(String[] args) {
        Sort sort = new MergeSort();
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
