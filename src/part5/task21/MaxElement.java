package part5.task21;

public class MaxElement {
    public static void main(String[] args) {
        int[] num = {44, 2, 311, 43, 343, 55, 7, 85, 9, 101};
        int maxNum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (maxNum < num[i]) {
                maxNum = num[i];
            }
        }
        System.out.println("Largest number: " + maxNum);
    }
}
