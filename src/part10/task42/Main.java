package part10.task42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomGrade = (int) (Math.random() * 11);
            grades.add(randomGrade);
        }
        System.out.println("Оценки учеников: " + grades);

        int maxGrade = grades.get(0);
        Iterator <Integer> iterator = grades.iterator();
        while (iterator.hasNext()) {
            int maxSearch = iterator.next();
            if (maxSearch > maxGrade) {
                maxGrade = maxSearch;
            }
        }
        System.out.println("Самая высокая оценка: " + maxGrade);
    }
}