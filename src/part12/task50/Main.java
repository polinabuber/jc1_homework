package part12.task50;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String fileName = "randomNumbers.bin";
        int n = 20;
        int[] numbers = new int[n];
        Random rand = new Random();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int i = 0; i < n; i++) {
                int num = rand.nextInt(100);
                dos.writeInt(num);
                numbers[i] = num;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < n; i++) {
                numbers[i] = dis.readInt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double sum = 0;
        for (int num : numbers) {
            System.out.println(num);
            sum += num;
        }
        double average = sum / n;
        System.out.println("Среднее арифметическое: " + average);
    }
}
