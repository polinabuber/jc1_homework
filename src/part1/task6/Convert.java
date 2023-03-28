package part1.task6;

public class Convert {
    public static void main(String[] args) {
        int s = 1209600;
        int sec, m, min, h, d, w;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        d = h / 24;
        w = d / 7;


        System.out.println(w + " недель " + d + " дней " + h + " часов " + min + " минут " + sec + " секунд ");
    }
}
