//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
        int age = 17;

        if (age >= 18) {
        System.out.println("вам 18 или больше лет");
        } else {
            System.out.println("ваш возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        //2
        int degrees = 5;

        if (degrees > 4) {
            System.out.println("сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("на улице холодно, нужно надеть шапку");
        }

        //3
        int speed = 40;

        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        //4
        int age2 = 10;

        if (age2 >= 2 && age2 <= 6) {
            System.out.println("нужно ходить в детский сад");
        }
        if (age2 > 6 && age2 <= 17) {
            System.out.println("нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.println("нужно ходить в университет");
        }
        if (age2 > 24) {
            System.out.println("пора ходить на работу");
        };

        //5
        int age3 = 20;

        if (age3 <= 5) {
            System.out.println("нельзя кататься на аттракционе");
        }
        if (age3 >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого");
        } else {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        }

        //6
        int numberOfPeople = 103;
        int maximumNumber = 102;
        int seatingCapacity = 60;

        if (numberOfPeople <= maximumNumber && numberOfPeople <= seatingCapacity) {
            System.out.println("место в вагоне есть сидячее");
        }
        if (numberOfPeople <= maximumNumber && numberOfPeople > seatingCapacity) {
            System.out.println("место в вагоне есть стоячее");
        }
        if (numberOfPeople > maximumNumber) {
            System.out.println("места в вагоне нет");
        }

        //7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }

    }
}