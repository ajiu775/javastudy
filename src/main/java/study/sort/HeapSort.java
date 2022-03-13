package study.sort;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/4/18/23:50
 */
public class HeapSort {

    public void sort(int[] array){
        for (int i = (array.length-1)/2;i>-1;i--){
            buildHeap(array,i,array.length);
        }

        for(int j = array.length-1;j>0;j--){
            int temp = array[j];
            array[j] = array[0];
            array[0] = temp;
            buildHeap(array,0,j);
        }

    }

    private void buildHeap(int[] array, int parent,int length) {
        int lChild = 2*parent+1;
        int temp = array[parent];
        while(length>lChild){
            int rChild = lChild+1;
            if(length>rChild&& array[lChild]<array[rChild]){
               lChild++;
            }
           if(temp>=array[lChild]){
               break;
           }else {
               array[parent]=array[lChild];
           }
           parent = lChild;
           lChild =lChild*2+1;
        }
       array[parent] = temp;
    }


    public static void main(String[] args) {
        int[] array = new int[]{10,38,7,8,90,45,1,4,6,4,7,7};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}