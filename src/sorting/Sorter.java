package sorting;

public class Sorter {
    public static int[] mergeSort(int[] arr) {
        return MergeSort.sort(arr);
    }

    public static void quicksort(int[] arr) {
        QuickSort.sort(arr);
    }

    public static void insertionSort(int[] arr) {InsertionSort.sort(arr);}
}
