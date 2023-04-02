package part4.task18;

import java.text.DecimalFormat;
public class RandomNumber {
    public static void main(String[] args) {
        int num = 12345678;
        System.out.println(new DecimalFormat("#,###").format(num));
    }
}
