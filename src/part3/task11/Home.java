package part3.task11;

public class Home {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = 10, d = 15;
        int e = 20, f = 25;

        if (f >= (b + d) && (e >= a && e >= c)) {
            System.out.println("Дома помещаются");
        } else if (f >= (a + c) && (e >= b && e >= d)) {
            System.out.println("Дома помещаются");
        } else if (f >= (b + c) && (e >= a && e >= d)) {
            System.out.println("Дома помещаются");
        } else if (f >= (a + d) && (e >= c && e >= b)) {
            System.out.println("Дома помещаются");
        } else if (e >= (b + d) && (f >= a && f >= c)) {
            System.out.println("Дома помещаются");
        } else if (e >= (a + d) && (f >= b && f >= c)) {
            System.out.println("Дома помещаются");
        } else if (e >= (b + c) && (f >= d && f >= a)) {
            System.out.println("Дома помещаются");
        } else if (e >= (a + c) && (f >= b && f >= d)) {
            System.out.println("Дома помещаются");
        } else {
            System.out.println("Дома не помещаются");
        }
    }
}
