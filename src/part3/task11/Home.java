package part3.task11;

public class Home {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = 10, d = 15;
        int e = 20, f = 25;

        if (f >= (a + c) && (e >= b || e >= d)) {
            System.out.println("Дома помещаются");
        } else if (e >= (b + d) && (f >= a || f >= c)) {
            System.out.println("Дома помещаются");
        } else {
            System.out.println("Дома не помещаются");
        }
        //Если можно ставить дом на дом, то можно сделать одну
        //проверку
        //if ((e >= a && e >= c) && (f >= b && f >= d)
        //System.out.println("Дома помещаются");
    }
}
