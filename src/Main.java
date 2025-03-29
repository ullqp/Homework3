//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1");
        int total = 2_459_000;
        int inMonth = 15_000;
        int available = 0;
        int months = 0;
        while (available < total) {
            available += inMonth;
            months += 1;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + available + " рублей");
        }



        System.out.println("\nЗадача 2");
        int start1 = 1;
        while (start1 < 11) {
            System.out.print(start1 + " ");
            start1 += 1;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }


        System.out.println("\n\nЗадача 3");
        int population = 12_000_000;
        int grow = 17;
        int decrease = 8;
        int year = 1;
        for (; year < 11; year++) {
            population = population + population / 1000 * (grow - decrease);
            System.out.println("Год " + year + " численность населения составляет " + population);
        }


        System.out.println("\nЗадача 4");
        int total2 = 12_000_000;
        int inMonthPercent2 = 7;
        int available2 = 15000;
        int months2 = 0;
        while (available2 < total2) {
            available2 += available2 * inMonthPercent2 / 100;
            months2 += 1;
            System.out.println("Месяц " + months2 + ", сумма накоплений равна " + available2 + " рублей");
        }


        System.out.println("\nЗадача 5");
        int total3 = 12_000_000;
        int inMonthPercent3 = 7;
        int available3 = 15000;
        int months3 = 0;
        while (available3 < total3) {
            available3 += available3 * inMonthPercent3 / 100;
            months3 += 1;
            if (months3 % 6 == 0) {
                System.out.println("Месяц " + months3 + ", сумма накоплений равна " + available3 + " рублей");
            }
        }


        System.out.println("\nЗадача 6");
        int duringMonths = 9 * 12;
        int inMonthPercent4 = 7;
        int available4 = 15000;
        int months4 = 0;
        while (months4 <= duringMonths) {
            available4 += available4 * inMonthPercent4 / 100;
            months4 += 1;
            if (months4 % 6 == 0) {
                System.out.println("Месяц " + months4 + ", сумма накоплений равна " + available4 + " рублей");
            }
        }


        System.out.println("\nЗадача 7");
        int firstFriday = 6;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
        }


        System.out.println("\nЗадача 8");
        int currentYear = 2025;
        int each = 79;
        int start = currentYear - 200;
        int finish = currentYear + 100;

        for(int years = start; years <= finish; years++) {
            if (years % each == 0) {
                System.out.println(years);
            }
        }
    }

}
