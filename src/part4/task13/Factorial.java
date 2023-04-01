package part4.task13;

public class Factorial {
    public static void main(String[] args) {
        int num = 0;
        int factorial = 1;

        while (num <= 10) {
            if (num == 0) {
                System.out.println(num + "!=1");
                num++;
                continue;
            }
            factorial = factorial * num;
            System.out.println(num + "!=" + factorial);
            num++;
        }
    }
}
