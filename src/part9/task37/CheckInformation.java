package part9.task37;

import part9.task36.Seasons;

public class CheckInformation {
    public boolean checkInformation(String season){
        if (season.length() == 0 || season == null) {
            System.out.println("Error");
            return false;
        }
        return true;
    }

    public Seasons checkSeason(String season){
        checkInformation(season);
        switch (season){
            case "summer": return Seasons.SUMMER;
            case "winter": return Seasons.WINTER;
            case "spring": return Seasons.SPRING;
            case "autumn": return Seasons.AUTUMN;
            default:
                System.out.println("Error");
                System.exit(1);
                return null;
        }
    }
}