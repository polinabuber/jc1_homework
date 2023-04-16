package part7.task27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public final static String ALL_M = "\\p{Punct}";

    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Pattern pattern = Pattern.compile(ALL_M);
        Scanner in = new Scanner(System.in);
        final Matcher matcher = pattern.matcher(in.nextLine());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Количество знаков препинания: " + count);
        in.close();
    }
}
