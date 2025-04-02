import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


        System.out.println("\nЗадача 2");
        int min = 1001;
        int max = -1;

        for (final int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        for (final int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");


        System.out.println("\nЗадача 3");
        float avg = (float) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");


        System.out.println("\nЗадача 4");
        char[] reversedFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};

        for (int i = 0; i < reversedFullName.length / 2; i++) {
            char temp = reversedFullName[i];
            reversedFullName[i] = reversedFullName[reversedFullName.length - 1 - i];
            reversedFullName[reversedFullName.length - 1 - i] = temp;
        }

        System.out.println(new String(reversedFullName));
        }



    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Генерация случайного числа до 1000
        }
        return array;
    }

}