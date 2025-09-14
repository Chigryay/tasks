package Algorithms;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 4, 5};
        System.out.println(indexBinarySearch(array, 1));
    }

    public static int indexBinarySearch(int[] sortedArray, int element) {
        int min = 0;
        int max = sortedArray[sortedArray.length - 1];

        while (min <= max) {
            int middle = (min + max) / 2;
            int currentElement = sortedArray[middle];
            if (currentElement == element) {
                return middle;
            } else if (currentElement < element) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
        return -1;
    }
}
