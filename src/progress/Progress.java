package progress;

public class Progress {
    public static void main(String[] args) {
        int[] nums = {10, 10, 6, 10, 10, 8, 10, 10, 5, 10, 4, 10, 10, 10, 10, 10, 10, 5, 10, 10, 6, 10, 10, 9};
        int result = 0;
        for (int m : nums) {
            result += m;
        }
        System.out.println("Среднее арифметическое: "+result/ nums.length);
    }
}
