package sorting;
import static sorting.utils.ArrayUtil.swap;

public class SelectionSort {
    public static void sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
}
