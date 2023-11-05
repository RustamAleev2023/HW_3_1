import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task9();


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
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты точки");
        System.out.println("Введите координату X (от -10 до 10)");
        int x = scanner.nextInt();
        System.out.println("Введите координату Y (от -10 до 10)");
        int y = scanner.nextInt();
        scanner.close();
        String message = "";
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.print("Четверть: ");

        if ((x > -10 && x < 10) && (y > -10 && y < 10)) {
            if (x > 0 && y > 0) {
                message = "I";
            }
            if (x > 0 && y < 0) {
                message = "IV";
            }
            if (x < 0 && y < 0) {
                message = "III";
            }
            if (x < 0 && y > 0) {
                message = "II";
            }
        } else {
            message = "Вы ввели неверные координаты";
        }

        System.out.println(message);
    }

    //Task5
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате дд мм гггг");

        String string = scanner.nextLine();

        String[] data = string.split(" ");
        int day = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);
        String zodiac = "";
        String chinaCalendar = "";

        switch (month) {
            case 1:
                if (day <= 20) {
                    zodiac = "Козерог";
                } else {
                    zodiac = "Водолей";
                }
                break;
            case 2:
                if (day <= 19) {
                    zodiac = "Водолей";
                } else {
                    zodiac = "Рыбы";
                }
                break;
            case 3:
                if (day <= 20) {
                    zodiac = "Рыбы";
                } else {
                    zodiac = "Овен";
                }
                break;
            case 4:
                if (day <= 20) {
                    zodiac = "Овен";
                } else {
                    zodiac = "Телец";
                }
                break;
            case 5:
                if (day <= 21) {
                    zodiac = "Телец";
                } else {
                    zodiac = "Близнецы";
                }
                break;
            case 6:
                if (day <= 21) {
                    zodiac = "Близнецы";
                } else {
                    zodiac = "Рак";
                }
                break;
            case 7:
                if (day <= 22) {
                    zodiac = "Рак";
                } else {
                    zodiac = "Лев";
                }
                break;
            case 8:
                if (day <= 21) {
                    zodiac = "Лев";
                } else {
                    zodiac = "Дева";
                }
                break;
            case 9:
                if (day <= 23) {
                    zodiac = "Дева";
                } else {
                    zodiac = "Весы";
                }
                break;
            case 10:
                if (day <= 23) {
                    zodiac = "Весы";
                } else {
                    zodiac = "Скорпион";
                }
                break;
            case 11:
                if (day <= 22) {
                    zodiac = "Скорпион";
                } else {
                    zodiac = "Стрелец";
                }
                break;
            case 12:
                if (day <= 22) {
                    zodiac = "Стрелец";
                } else {
                    zodiac = "Козерог";
                }
                break;
        }

        switch (year % 12) {
            case 0:
                chinaCalendar = "Обезьяны";
                break;
            case 1:
                chinaCalendar = "Петуха";
                break;
            case 2:
                chinaCalendar = "Собаки";
                break;
            case 3:
                chinaCalendar = "Свиньи";
                break;
            case 4:
                chinaCalendar = "Крысы";
                break;
            case 5:
                chinaCalendar = "Быка";
                break;
            case 6:
                chinaCalendar = "Тигра";
                break;
            case 7:
                chinaCalendar = "Кролика";
                break;
            case 8:
                chinaCalendar = "Дракона";
                break;
            case 9:
                chinaCalendar = "Змеи";
                break;
            case 10:
                chinaCalendar = "Лошади";
                break;
            case 11:
                chinaCalendar = "Овцы";
                break;

        }
        System.out.println("Вывод: ");
        System.out.println("Знак: " + zodiac);
        System.out.println("Год: " + chinaCalendar);

    }

    //Task6
    public static void task6() {
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 400 != 0) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }
    }

    //Task7
    public static void task7() {
        String[] rus = {"а", "б", "в", "г", "д", "е", "ё", "ж", "и", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        String[] eng = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] digit = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        boolean isFound = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите букву или цифру");
        String letter = scanner.next();

        scanner.close();

        for (String s : eng) {
            if (s.equalsIgnoreCase(letter)) {
                System.out.println("латиница");
                isFound = true;
            }
        }
        for (String s : rus) {
            if (s.equalsIgnoreCase(letter)) {
                System.out.println("кирилица");
                isFound = true;
            }
        }
        for (String s : digit) {
            if (s.equalsIgnoreCase(letter)) {
                System.out.println("цифра");
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("невозможно определить");
        }
    }

    //Task8
    public static void task8() {
        int x = 2;
        int y = 1;

        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 != 0 && y % 2 != 0)) {
            System.out.println("YES");
        }
    }

    //Task9
    public static void task9(){
        int startX = 10;
        int startY = 10000;

        int finishX = 10;
        int finishY = 100;

        if(startX != finishX && startY < finishY){
            System.out.println("Подъем");
        }
        if(startX != finishX && startY > finishY){
            System.out.println("Спуск");
        }
        if(startX != finishX && startY == finishY){
            System.out.println("Ровная дорога");
        }
        if(startX == finishX && startY != finishY){
            System.out.println("Отвесная дорога");
        }

    }

}