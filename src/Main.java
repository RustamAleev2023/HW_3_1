import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task4();

    }

    //Task1
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели (от 1 до 7):");

        int dayOfWeekNumber = scanner.nextInt();
        scanner.close();
        String message = "";


        switch (dayOfWeekNumber) {
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
                message = "Вы ввели неверный номер";
                break;
        }

        System.out.println(message);
    }

    //Task2
    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во часов (от 0 до 24)");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour <= 24) {

            if (hour >= 6 && hour < 12) {
                System.out.println("Доброе утро!");
            }
            if (hour >= 12 && hour < 17) {
                System.out.println("Добрый день!");
            }
            if (hour >= 17 && hour < 22) {
                System.out.println("Добрый вечер!");
            }
            if ((hour >= 22 && hour <= 24) || (hour >= 0 && hour < 6)) {
                System.out.println("Доброй ночи!");
            }

        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }

    //Task3
    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите животное из списка: ");
        /*
        1 - кошка
        2 - собака
        3 - корова
        4 - коза
        5 - овца
        6 - ворона
        7 - утка
        8 - дятел
        9 - свинья
        10 - ёжик
         */

        int animal = scanner.nextInt();
        scanner.close();
        String voice = "";

        switch (animal) {
            case 1:
                voice = "Мяу";
                break;
            case 2:
                voice = "Гав";
                break;
            case 3:
                voice = "Мууу";
                break;
            case 4:
                voice = "Беее";
                break;
            case 5:
                voice = "Меее";
                break;
            case 6:
                voice = "Кар";
                break;
            case 7:
                voice = "Кря";
                break;
            case 8:
                voice = "Тук-Тук";
                break;
            case 9:
                voice = "Хрю";
                break;
            case 10:
                voice = "Фррр";
                break;
            default:
                voice = "Некорректный ввод";
                break;
        }
        System.out.println(voice);
    }

    //Task4
    public static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        System.out.println("Введите координату X (от -10 до 10)");
        int x = scanner.nextInt();
        System.out.println("Введите координату Y (от -10 до 10)");
        int y = scanner.nextInt();
        scanner.close();
        String message="";
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.print("Четверть: ");

        if((x > -10 && x < 10) && (y > -10 && y < 10)){
            if(x > 0 && y > 0){
                message = "I";
            }
            if(x > 0 && y < 0){
                message = "IV";
            }
            if(x < 0 && y < 0){
                message = "III";
            }
            if(x < 0 && y > 0){
                message = "II";
            }
        } else {
            message = "Вы ввели неверные координаты";
        }

        System.out.println(message);
    }
}