package part12.task52;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CreatePersons {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Dave", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy"};
        String[] surnames = {"Anderson", "Brown", "Clark", "Davis", "Evans", "Franklin", "Green", "Harris", "Ingram", "Jackson"};
        Random rand = new Random();
        Person[] persons = new Person[10];
        for (int i = 0; i < 10; i++) {
            String name = names[rand.nextInt(names.length)];
            String surname = surnames[rand.nextInt(surnames.length)];
            int age = rand.nextInt(100);
            persons[i] = new Person(name, surname, age);
        }

        File file = new File("persons.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (Person person : persons) {
                writer.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}