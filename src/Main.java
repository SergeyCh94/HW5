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
    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("\n");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
        System.out.println("\n");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(d + ":" + m + ":" + y + ".");
        System.out.println("\n");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        String namePerson = scanner.next();
        String nameAssistant = scanner.next();
        int countMail = scanner.nextInt();
        System.out.println("Привет, " + namePerson + "! Это твой помощник " + nameAssistant + ".\nУ тебя " + countMail + " новых писем.");
        System.out.println("\n");
    }
}