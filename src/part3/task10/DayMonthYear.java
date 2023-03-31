package part3.task10;

import java.util.Calendar;

public class DayMonthYear {
    public static void main(String[] args) {
        int day = 5;
        int month = 7;
        int year = 2019;
        //TODO: JULY 32 !!!!

        if (day == 28 && month == 2 && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))) {
            day++;
            System.out.println("Високосный год. Следующий день: " + day + "." + month + "." + year);
        } else if ((day >= 1 && day <= 31) && (month >= 1 && month <= 12)) {
            day++;
            System.out.println("Следующий день: " + day + "." + month + "." + year);
        }  else if ((day == 30) && (month == 2 || month == 5 || month == 9 || month == 11)) {
            day = 1;
            month++;
            System.out.println("Следующий день: " + day + "." + month + "." + year);
        } else if ((day == 31) && (month == 1 || month == 3 || month == 4 || month == 8 || month == 10)) {
            day = 1;
            month++;
            System.out.println("Следующий день: " + day + "." + month + "." + year);
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println("Следующий день: " + day + "." + month + "." + year);

        } else {
            day = 1;
            month++;
            System.out.println("Следующий день: " + day + "." + month + "." + year);
        }


    }
}
