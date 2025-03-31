import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        System.out.println("\nЗадача 1");
        int[] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float[] digits = {1.57f, 7.654f, 9.986f};

        boolean[] magic = {true, false, true, false};


        System.out.println("\nЗадача 2");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(digits[0]);
        System.out.println(digits[1]);
        System.out.println(digits[2]);
        System.out.println(magic[0]);
        System.out.println(magic[1]);
        System.out.println(magic[2]);
        System.out.println(magic[3]);


        System.out.println("\nЗадача 3");
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = digits.length-1; i >= 0; i--) {
            System.out.print(digits[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = magic.length-1; i >= 0; i--) {
            System.out.print(magic[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }


        System.out.println("\n\nЗадача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
            numbers[i] += 1;
        }}
        System.out.println(Arrays.toString(numbers));

    }
}