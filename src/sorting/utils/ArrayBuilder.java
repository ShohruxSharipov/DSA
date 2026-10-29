package sorting.utils;

import java.util.Random;

public class ArrayBuilder {
    public static int[] integerOf(int size, int upper) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(upper);
        }
        return array;
    }
}
