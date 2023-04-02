package part5.task20;

public class AnotherArray {
    public static void main(String[] args) {
        int[] marks = new int[10];
        marks[0] = 13;
        marks[1] = 2;
        marks[2] = 5;
        marks[3] = 8;
        marks[4] = 54;
        marks[5] = 3;
        marks[6] = 12;
        marks[7] = 1;
        marks[8] = 9;
        marks[9] = 3;
        for (int i = 0; i < marks.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index: " + i + "  Number: " + marks[i]);
            }
        }

    }
}
