package Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int countOdd = 0;
        int countHonest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countHonest++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countOdd + " " + countHonest);
    }
}
