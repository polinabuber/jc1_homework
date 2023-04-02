package part5.task23;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nПеревёрнутый:");
        for (int i = 0; i < num.length / 2; i++) {
            int rev = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = rev;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
