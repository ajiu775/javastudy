package study.sort;

public class HeapSort implements Sort{
    @Override
    public void sort(int[] array) {
        buildHeap(array);
        int heapSize = array.length-1;
        for (int i = heapSize; i >-1; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapSize--;
            arrangeHeap(array,0,heapSize);
        }
    }

    private void buildHeap(int[] array) {
        int n = array.length;
        int index = (n-2)/2;
        for(int i = index;i>-1;i--){
            arrangeHeap(array,i,n);
        }
    }

    private void arrangeHeap(int[] array, int index, int heapSize) {
          int leftChild = index*2+1;
          int rightChild = index*2+2;
          int largeIndex;
          if(heapSize>leftChild&&array[leftChild]>array[index]){
              largeIndex = leftChild;
          }else{
              largeIndex = index;
          }

          if(heapSize>rightChild&& array[rightChild]>array[largeIndex]){
              largeIndex = rightChild;
          }
          if(largeIndex!=index){
              int temp = array[index];
              array[index] = array[largeIndex];
              array[largeIndex] =array[index];
              arrangeHeap(array,largeIndex,heapSize);
          }
    }
}
