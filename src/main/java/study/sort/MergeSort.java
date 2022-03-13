package study.sort;

public class MergeSort implements Sort {

    @Override
    public void sort(int[] array) {
        int start =0;
        int end = array.length-1;
        int [] temp = new int[array.length];
        mergeSort(array,start,end,temp);
    }

    private void mergeSort(int[] array, int low, int high, int[] temp) {
        if(low<high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid, temp);
            mergeSort(array, mid + 1, high, temp);
            merge(array, low, mid, high, temp);
        }
    }

    private void merge(int[] array, int low, int mid, int high, int[] temp) {
        int i = 0;
        int low1 = low;
        int high1 = mid +1;
        while(low1<=mid && high1<=high){
            if(array[low1]<array[high1]){
                temp[i++]=array[low1++];
            }else{
                temp[i++] = array[high1++];
            }
        }
        while(low1<=mid){
            temp[i++] = array[low1++];
        }
        while(high1<=high){
            temp[i++] = array[high1++];
        }
        for(int j = 0;j<i;j++){
            array[low+j] = temp[j];
        }
    }
}
