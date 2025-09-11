package Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] numbers = {34, 12, 67, 23, 89, 3, 45};
        System.out.println(minElement(numbers));
    }

    public static int minElement(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            min = Math.min(array[i], min);
        }
        return min;
    }
}
