package sorting;

public class InsertionSort {
    public static void sort(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            while (j > 0 && arr[i] < arr[j]) {
                arr[j] = arr[j + 1];
                j--;
            }
            arr[j++] = arr[i];
        }
    }
}
