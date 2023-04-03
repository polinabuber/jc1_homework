package part4.task18;

public class RandomNumber {
    public static void main(String[] args) {
        int num = 123455555;
        int i = 0;
        int j;
        String accounting = "";

        while (num > 0) {
            j = num % 10;
            accounting = j + accounting;
            num = num / 10;
            i++;
            if (i % 3 == 0 && num != 0) {
                accounting = " " + accounting;
            }
        }
        System.out.println(accounting);
    }
       /* int num = 12345678;
        System.out.println(new DecimalFormat("#,###").format(num));*/
}

