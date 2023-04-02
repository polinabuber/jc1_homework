package part5.task22;

public class ArraySum {
    public static void main(String[] args) {
        int[] num = {44, 700, 311, 43, 56, 55, 7, 85, 500, 101};
        int min = num[0];
        int minIndex = 0;
        int max = num[0];
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
                maxIndex = i;
            }
            if (num[i] < min) {
                min = num[i];
                minIndex = i;
            }
        }
        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += num[i];
            }
        }
        if (maxIndex < minIndex) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
