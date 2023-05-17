package part12.task49;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Bla bla bla 1,2,3,3,4";
        String fileName = "newText.txt";
        writeTextToFile(text, fileName);
        List<Integer> numbers = readNumbersFromFile(fileName);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Числа в тексте: " + numbers);
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Числа в тексте, без повтора: " + new HashSet<>(numbers));
    }

    private static void writeTextToFile(String text, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static List<Integer> readNumbersFromFile(String fileName) {
        Pattern pattern = Pattern.compile("\\b[\\d]+\\b");
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String match = matcher.group();
                    int number = Integer.parseInt(match);
                    numbers.add(number);
                }
            }
            return numbers;
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
