package part4.task16;

public class Break {


    public static void main(String[] args) {

        int num = 0;

        for (int i = 50; i <= 70; i++) {
            boolean simple = true;
            for (int p = 2; p < i; p++) {
                if (i % p == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                num++;
                if (num == 2) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}