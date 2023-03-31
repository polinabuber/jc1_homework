package part3.task7;

public class IsThatSeven {
    public static void main(String[] args) {
        System.out.println(seven(17));

    }

    static boolean seven(int num) {
        if (num % 10 == 7) {
            return true;

        } else {
            return false;
        }
    }


}
