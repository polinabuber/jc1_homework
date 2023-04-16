package part7.task32;


public class Main {
    public static void main(String[] args) {

        long time1 = System.currentTimeMillis();
        concatString("aaabbbccc", 1_000);
        time1 = System.currentTimeMillis() - time1;
        System.out.println("String: " + time1);

        long time2 = System.currentTimeMillis();
        appStringBuilder("aaabbbccc", 1_000_000);
        time2 = System.currentTimeMillis() - time2;
        System.out.println("StringBuilder: " + time2);

        System.out.println("Время выполнения отличается на " + (time1 - time2) + " мс");
    }


    private static String concatString(String txt, int count) {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += txt;
        }
        return str;
    }

    private static String appStringBuilder(String txt, int count) {
        StringBuilder str = new StringBuilder();
        str.append(String.valueOf(txt).repeat(Math.max(0, count)));
        return str.toString();
    }


}