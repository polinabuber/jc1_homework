package part3.task12;

public class Planner {
    public static void main(String[] args) {
        int dayOfWeek = 7;
        String day;
        switch (dayOfWeek) {
            case 1:
                day = "\nTask №1\n"+"Task №2";
                break;
            case 2:
                day = "\nTask №2\n"+"Task №3";
                break;
            case 3:
                day = "\nTask №4\n"+"Task №5";
                break;
            case 4:
                day = "\nTask №6\n"+"Task №7";
                break;
            case 5:
                day = "\nTask №8\n"+"Task №9";
                break;
            case 6:
                day = "\nTask №10\n"+"Task №11";
                break;
            case 7:
                day = "\nTask №12\n"+"Task №13";
                break;
            default:
                day = "Error";
        }
        System.out.println("Schedule: " + day);
    }
}
