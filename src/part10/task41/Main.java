package part10.task41;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 15));
        }
        System.out.println("Коллекция случайных чисел: " + list);

        Set<Integer> set = new HashSet<>(list);
        System.out.println("Без повторяющихся значений: " + set);
    }
}