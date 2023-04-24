package part9.task37;

import part9.task36.Seasons;

public class Main {
    public static void main(String[] args) {
        showNextSeason();
    }
    public static void showNextSeason(){
        Seasons seasonsOfTheYear = new CheckInformation().checkSeason(new Input().inputSeason());
        System.out.println("Следующий сезон: ");
        if (seasonsOfTheYear.ordinal() == Seasons.values().length - 1)
            System.out.println(Seasons.values()[0]);
        else
            System.out.println(Seasons.values()[seasonsOfTheYear.ordinal() + 1]);
    }
}