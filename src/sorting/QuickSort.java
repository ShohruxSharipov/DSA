package sorting;
import static sorting.utils.ArrayUtil.swap;

public class QuickSort {
    public static void sort(int[] arr) {
        // I take the last element as a pivot
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int head, int tail) {
        if (head < tail) {
            int pivot = partition(arr, head, tail);
            quickSort(arr, head, pivot - 1);
            quickSort(arr, pivot + 1, tail);
        }
    }

    private static int partition(int[] arr, int head, int tail) {
        int i = head-1;
        int j = head;
        int x = arr[tail];
        while (j <= tail) {
            if (arr[j] < x) {
                i++;
               swap(arr,i,j);
            }
            j++;
        }
        i++;
        int temp = arr[i];
        arr[i] = x;
        arr[tail] = temp;
        return i;
    }
}
