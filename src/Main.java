//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean isYearLeap(int year) {
        boolean isYearLeap = (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        return isYearLeap;
    }

    public static void printIsYearLeap(boolean isYearLeap, int year) {
        if (isYearLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }}


    public static boolean isVersionLite(int clientOS, int clientDeviceYear) {
        boolean isVersionLite = ((clientDeviceYear <= 2015 && clientOS == 0) || (clientDeviceYear <= 2015 && clientOS == 1));
        return isVersionLite;
    }

    public static void printIsVersionLite(int clientOS, boolean isVersionLite) {
        if (isVersionLite) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
            else {System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        } else {
            if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }


    public static int countDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void printCountDays(int countDays) {
        if (countDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + countDays);
        }
    }


    public static void main (String[] args ) {
        int year = 1940;
        boolean isYearLeap = isYearLeap(year);
        printIsYearLeap(isYearLeap, year);

        int clientOS = 0;
        int clientDeviceYear = 2016;
        boolean isVersionLite = isVersionLite(clientOS, clientDeviceYear);
        printIsVersionLite(clientOS, isVersionLite);

        int deliveryDistance = 101;
        int countDays = countDays(deliveryDistance);
        printCountDays(countDays);

    }
    }