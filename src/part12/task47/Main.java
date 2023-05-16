package part12.task47;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        File folder = new File("src");
        String[] listOfFiles = folder.list();

        try {
            List<String> fileNames = new ArrayList<>();
            List<String> directoryNames = new ArrayList<>();

            for (String name : listOfFiles) {
                if (!new File(folder, name).isDirectory()) {
                    fileNames.add(name);
                } else {
                    directoryNames.add(name);
                }
            }
            System.out.println("Файлы: ");
            fileNames.forEach(System.out::println);

            System.out.println("Директории: ");
            directoryNames.forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }

    }
}