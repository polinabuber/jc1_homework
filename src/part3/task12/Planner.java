package part3.task12;

public class Planner {
    public static void main(String[] args) {
        int dayOfWeek = 7;
        String day;
        switch (dayOfWeek) {
            case 1:
                day = "Прыгать, бегать";
                break;
            case 2:
                day = "Смотреть в окно";
                break;
            case 3:
                day = "Кормить уток";
                break;
            case 4:
                day = "Играть с котом в бантик";
                break;
            case 5:
                day = "Отдых";
                break;
            case 6:
                day = "Собрать походный набор";
                break;
            case 7:
                day = "Найти пульт от кондиционера";
                break;
            default:
                day = "День недели введён некорректно";
                break;
        }
        System.out.println("Планы на этот день: " + day);
    }
}
