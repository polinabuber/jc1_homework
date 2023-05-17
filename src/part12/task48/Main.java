package part12.task48;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String PUNCTUATION_REGEX = "[,.!?;:]";
    private static final String WORD_REGEX = "\\w+";

    public static void main(String[] args) {

        String text = "Bla bla bla ......";
        File file = new File("text.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String content = new String(Files.readAllBytes(Paths.get("text.txt")));
            int punctuationCount = 0;
            Pattern punctuationPattern = Pattern.compile(PUNCTUATION_REGEX);
            Matcher punctuationMatcher = punctuationPattern.matcher(content);
            while (punctuationMatcher.find()) {
                punctuationCount++;
            }

            int wordCount = 0;
            Pattern wordPattern = Pattern.compile(WORD_REGEX);
            Matcher wordMatcher = wordPattern.matcher(content);
            while (wordMatcher.find()) {
                wordCount++;
            }

            System.out.println("Знаков препинания: "+ punctuationCount);
            System.out.println("Слов: "+ wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}