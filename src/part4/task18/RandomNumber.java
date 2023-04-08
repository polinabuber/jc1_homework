package part4.task18;

public class RandomNumber {
    public static void main(String[] args) {
        int num = 12050000;
        int i = 0;
        int j;
        String accounting = "";

        while (num > 0) {
            j = num % 1000;
            accounting = j + " " + accounting;
            num = num / 1000;
            i++;
        }
        System.out.println(accounting);
    }
}

