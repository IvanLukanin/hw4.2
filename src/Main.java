import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накомлений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int m = 1; m < 11; m = m + 1)
            System.out.print(" " + m + " ");
        System.out.println();
        int n = 11;
        while (n > 1) {
            n = n - 1;
            System.out.print(" " + n + " ");
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationHuman = 12_000_000;
        int bornHuman = 17;
        int deathHuman = 8;
        int dif = bornHuman - deathHuman;
        for (int f = 1; f <= 10; f++) {
            populationHuman += populationHuman * dif / 1000;
            System.out.println("Год " + f + " численность населения составляет " + populationHuman);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int monthlyPercentage = 7;
        int total = 0;
        int contribution = 15000;
        int count = 0;
        while (total < 12_000_000) {
            total = total + total / 100 * monthlyPercentage + contribution;
            count++;
            {
                System.out.println("Месяц " + count + " на счету: " + total + " рублей");
            }
        }
        System.out.println("Последний месяц " + count + " на счету: " + total + " рублей");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthlyPercentage = 7;
        int total = 15000;
        int contribution = 15000;
        int count = 0;
        while (total < 12000000) {
            total = total + total / 100 * monthlyPercentage + contribution;
            count++;
            if (count % 6 == 0) {
                System.out.println("Месяц " + count + " на счету:" + total + " рублей");
            }
        }
        System.out.println("Последний месяц " + count + " на счету:" + total + " рублей");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int monthlyPercentage = 7;
        int year = 9;
        int month = year * 12;
        int total = 15000;
        int contribution = 15000;
        int count = 0;
        while (count < month) {
            total = total + total / 100 * monthlyPercentage + contribution;
            count++;
            if (count % 6 == 0) {
                System.out.println("Месяц " + count + " на счету:" + total + " рублей");
            }
        }
        System.out.println("Сумма накоплений равна -  " + total + " рублей, за " + year + " лет");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday < 31) {
            System.out.println("Сегодня пятница " + friday + "-е число, пора делать отчёт");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2023;
        int cometHere = 79;
        int yearOfComing = 0;

        while (yearOfComing <= year + 100) {
            yearOfComing = yearOfComing + cometHere;

            if (year - 200 < yearOfComing && yearOfComing <= year + 100) {
                System.out.println(yearOfComing);
            }
        }
    }
}