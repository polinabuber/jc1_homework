package part10.task40;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomGrade = (int) (Math.random() * 11);
            grades.add(randomGrade);
        }
        System.out.println("Оценки учеников: " + grades);

        grades.removeIf(grade -> grade <= 4);
        System.out.println("Положительные оценки: " + grades);
    }

}
