package part11.task44;


public class Main {

    public static void main(String[] args) {
        String nullString = null;
        try {
            int length = nullString.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}

