package part5.task24;

public class Butterfly {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int i, j;
        for (i = 0; i < arr.length / 2; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (i = arr.length - 1; i >= arr.length / 2; i--) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }

        //Бабочка из единичек

   /*     for (j = 0; j < arr.length / 2; j++) {
            for (i = 0; i < arr[j].length; i++) {
                if ((i < j) || (i >= (arr[j].length - j)))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (j = arr.length - 1; j >= arr.length / 2; j--) {
            for (i = 0; i < arr[j].length; i++) {
                if ((i < (arr[j].length - 1 - j)) || (i > j))
                    arr[i][j] = 0;
                else
                    arr[i][j] = 1;
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }*/
}}
