package part9.task37;


import java.util.Locale;
import java.util.Scanner;

public class Input {
    public String inputSeason(){
        System.out.println("Введите сезон в формате Winter, Summer, Autumn, Spring");
        return new Scanner(System.in).next().toLowerCase(Locale.ROOT);

    }
}