package Arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int indexStart = 0;
        int indexFinish = original.length - 1;
        for (int i = 0; i < original.length / 2 - 1; i++) {
            int elem2 = original[indexFinish];
            int elem1 = original[indexStart];
            original[indexFinish] = elem1;
            original[indexStart] = elem2;
            indexStart++;
            indexFinish--;
        }

        System.out.println(Arrays.toString(original));
    }
}
