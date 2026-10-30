package sorting;

public class Sorter {
    public static int[] mergeSort(int[] arr) {
        return MergeSort.sort(arr);
    }

    public static void quicksort(int[] arr) {
        QuickSort.sort(arr);
    }

    public static void insertionSort(int[] arr) {InsertionSort.sort(arr);}

    public static void bubbleSort(int[] arr) {BubbleSort.sort(arr);}

    public static void selectionSort(int[] arr) {SelectionSort.sort(arr);}
}
