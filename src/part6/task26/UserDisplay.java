package part6.task26;

import java.util.Scanner;

import static part6.task26.Account.balance;
import static part6.task26.Account.input;


public class UserDisplay {

    static boolean flag = Account.flag;

    public static void startMenu() {

        if (flag) {
            char answer = 'y';
            while (answer == 'y') {
                System.out.println("Выберите операцию: 1. Вывод средств 2. Пополнение счета 3. Проверка баланса");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("---> Вывод средств");
                        System.out.println("Введите сумму:");
                        int withdraw = input.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Заберите деньги. Текущий баланс: " + balance);
                        } else if (withdraw >= balance) {
                            System.out.println("Недостаточно средств");
                        } else {
                            System.out.println("Неизвестная ошибка");
                        }
                        break;
                    case 2:

                        System.out.println("---> Депозит");
                        System.out.println("Введите сумму");
                        double saveMoney = input.nextDouble();
                        if (saveMoney > 0 && saveMoney <= 2500) {
                            if (saveMoney % 20 == 0 || saveMoney % 50 == 0) {
                                balance += saveMoney;
                                System.out.println("Успешно! Баланс BYN " + balance);
                            }
                        } else if (saveMoney > 2500) {
                            System.out.println("Максимальная сумма депозита за один раз: 2500");
                        } else {
                            System.out.println("Неизвестная ошибка");
                        }
                        break;
                    case 3:

                        System.out.println("---> Проверить баланс");
                        System.out.println("Баланс: " + balance + "BYN");
                        break;

                    default:
                        System.out.println("Неизвестная операция");
                        break;
                }
                System.out.println("Продолжить? Да(y) / Нет(n)");
                answer = input.next().charAt(0);

            }
            System.out.println("Неизвестная ошибка. Завершение сеанса");

        }

    }

    public static void print(Banknotes[] banknotes) {
        for (int banknotesNumber = 1; banknotesNumber <= banknotes.length; banknotesNumber++) {
            int i = banknotesNumber - 1;
            if (banknotes[i] == null || banknotes[i].getCount() <= 0) continue;
            System.out.println("[" + banknotesNumber + "] " + banknotes[i].getName() + " BYN");
        }
    }

    public static void promptSelectBanknotes() {
        System.out.println("Сумма:");
    }

    public static int readBanknotesNumber() {
        Scanner scanner = new Scanner(System.in);
        String banknotesNumberPattern = "[1-3]";
        boolean isCorrectValue = false;
        int banknotesNumber = -1;
        while (!isCorrectValue) {
            if (scanner.hasNext(banknotesNumberPattern)) {
                isCorrectValue = true;
                banknotesNumber = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return banknotesNumber;
    }

}