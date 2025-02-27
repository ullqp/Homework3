//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        };

        // 2
        System.out.println("\nЗадача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        };

        // 3
        System.out.println("\nЗадача 3");
        for (int i = 0; i < 18; i+=2) {
            System.out.println(i);
        };

        // 4
        System.out.println("\nЗадача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        };

        // 5
        System.out.println("\nЗадача 5");
        for (int i = 1904; i < 2097; i+=4) {
            System.out.println(i + " год является високосным");
        };

        // 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i < 99; i+=7) {
            System.out.println(i);
        };

        // 7
        System.out.println("\nЗадача 7");
        for (int i = 1; i < 513; i*=2) {
            System.out.println(i);
        };

        // 8
        System.out.println("\nЗадача 8");
        int total = 0;
        int inMonth = 29000;
        for (int i = 1; i < 13; i+=1) {
            total += inMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        };

        // 9
        System.out.println("\nЗадача 9");
        int total2 = 0;
        int inMonth2 = 29000;
        for (int i = 1; i < 13; i+=1) {
            total2 += total2/100;
            total2 += inMonth2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        };

        // 10
        System.out.println("\nЗадача 10");
        for (int i = 1; i < 11; i+=1) {
            System.out.println("2*" + i + "=" + i*2);
        };
    }
    }
