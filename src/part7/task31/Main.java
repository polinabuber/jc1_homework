package part7.task31;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = in.nextLine();
        String inputReplace = input.replaceAll("<^p>|<p[^<>]+>", "<p>");
        System.out.println(inputReplace);
        in.close();
    }
}
