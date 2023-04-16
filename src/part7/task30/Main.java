package part7.task30;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public final static String ALL_NUMBERS = "0[xX][0-9A-Fa-f]{1,4}";

    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Pattern pattern = Pattern.compile(ALL_NUMBERS);
        Scanner in = new Scanner(System.in);
        final Matcher matcher = pattern.matcher(in.nextLine());
        while (matcher.find()) {
            System.out.println("Шестнадцатеричные числа: " + matcher.group());
        }
        in.close();
    }
}
