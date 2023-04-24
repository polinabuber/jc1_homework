package part9.task38;

import part9.task36.Seasons;
import part9.task37.CheckInformation;
import part9.task37.Input;

public class Main {
    public static void main(String[] args) {
        showCountOfDays();
    }

    public static void showCountOfDays(){
        Seasons seasonsOfTheYear = new CheckInformation().checkSeason(new Input().inputSeason());
        System.out.println("Количество дней в "+ seasonsOfTheYear + " — " + seasonsOfTheYear.getCountOfDays());
    }
}