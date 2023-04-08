package part3.task9;

public class Rub {
    public static void main(String[] args) {
        int rubles = 12;

        if (rubles % 10 == 1) {
            System.out.println(rubles + " рубль");
        } else if (rubles % 10 == -1) {
            System.out.println(rubles + " рубль");
        } else if (rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4) {
            System.out.println(rubles + " рубля");
        } else if (rubles % 10 == -2 || rubles % 10 == -3 || rubles % 10 == -4) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
    }
}
