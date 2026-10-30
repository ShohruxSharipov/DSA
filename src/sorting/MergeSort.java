package sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int median = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, median);
        int[] right = Arrays.copyOfRange(arr, median, arr.length);

        left = sort(left);
        right = sort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }
}
