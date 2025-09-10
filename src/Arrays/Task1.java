package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 67, 3, 89, 23, 5};
        System.out.println(Arrays.toString(calcMinAndMaxElements(numbers)));
    }

    public static int[] calcMinAndMaxElements(int[] array) {
        int[] minMax = new int[2];
        int currentElement;
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i]);
        }
        minMax[0] = min;
        minMax[1] = max;
        return minMax;
    }
}
