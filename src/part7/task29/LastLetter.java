package part7.task29;


import java.util.Scanner;


public class LastLetter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = in.nextLine();
        StringBuilder sbild = new StringBuilder();

        String[] words = str.split("\\b\\s+");

        for (String word : words) {
            sbild.append(word.toCharArray()[word.length() - 1]);
        }
        System.out.println("Результат: " + sbild);
        in.close();
    }
}