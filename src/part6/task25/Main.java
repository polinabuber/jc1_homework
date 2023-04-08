package part6.task25;

import static part6.task25.Time.ofSeconds;

public class Main {
    public static void main(String[] args) {
        Time a = new Time(20, 30, 8);
        System.out.println(a.compareTo(ofSeconds(73808)));
    }
}
