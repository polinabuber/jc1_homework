package progress;

public class Progress {
    public static void main(String[] args) {
        int[] nums = {10, 10, 6, 10, 10, 8, 10, 10, 5, 10, 4, 10, 10, 10, 10, 10, 10, 5, 10, 10, 6, 10, 10, 9, 7, 10, 10, 10, 10, 10, 10, 9, 10, 9, 9, 10, 7, 7, 8};
        int result = 0;
        for (int m : nums) {
            result += m;
        }
        System.out.println("Среднее арифметическое: " + result / nums.length);
    }
}
