package part4.task15;


public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        long num = 7893823445L;
        do {
            sum += (num % 10);
            num /= 10;
        }
        while (num != 0);
        System.out.println(sum);
    }
}
