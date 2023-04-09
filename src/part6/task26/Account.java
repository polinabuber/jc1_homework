package part6.task26;

import java.util.Scanner;

public class Account {

    public static Scanner input = new Scanner(System.in);

    static int balance = 1000;
    static int pwd = 1111; // пароль
    static boolean flag = true;

    public static void user() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите пароль(1111): ");
            int inputPwd = input.nextInt();

            if (inputPwd == pwd) {
                flag = true;
                break;
            } else {
                if (i <= 2) {
                    System.out.println("Неверный пароль. Осталось " + (3 - i) + " попытки");
                } else {
                    System.out.println("Завершение сеанса");
                    break;
                }
                flag = false;
            }
        }
    }

    public int showBalance(){
        return balance;
    }
}
