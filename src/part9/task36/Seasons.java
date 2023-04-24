package part9.task36;

public enum Seasons {
    WINTER("Холодно", 90),
    SPRING("Не очень холодно", 92),
    SUMMER("Жарко", 92),
    AUTUMN("Не очень жарко", 91);

    private final String description;
    private final int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void Display() {
        System.out.println("Сезоны:");
        for (Seasons ssns : Seasons.values()) {
            System.out.println(ssns + ". Описание: " + ssns.getDescription() + ". Дней в сезоне: " + ssns.getCountOfDays());
        }
    }
}