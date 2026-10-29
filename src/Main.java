import sorting.Sorter;
import sorting.utils.ArrayBuilder;
import static sorting.utils.ArrayUtil.*;


public class Main {
    public static void main(String[] args) {
        int[] arr = ArrayBuilder.integerOf(5,100);
        printArray(arr);
        Sorter.insertionSort(arr);
        printArray(arr);
    }
}