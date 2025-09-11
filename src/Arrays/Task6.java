package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(returnReversArray(numbers)));;
    }

    public static int[] returnReversArray(int[] array) {
        int[] array2 = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            array2[k] = array[i];
            k++;
        }
        return array2;
    }
}
