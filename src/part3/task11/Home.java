package part3.task11;

public class Home {
    public static void main(String[] args) {
        int a = 1, b = 1;
        int c = 1, d = 10;
        int e = 2, f =2;

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
