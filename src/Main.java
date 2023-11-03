import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task2();

    }
    //Task1
    public static void task1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер дня недели (от 1 до 7):");

        int dayOfWeekNumber = scanner.nextInt();
        scanner.close();
        String message = "";


        switch (dayOfWeekNumber){
            case 1: message = "Monday";
            break;
            case 2: message = "Tuesday";
            break;
            case 3: message = "Wednesday";
            break;
            case 4: message = "Thursday";
            break;
            case 5: message = "Friday";
            break;
            case 6: message = "Saturday";
            break;
            case 7: message = "Sunday";
            break;
            default: message = "Вы ввели неверный номер";
                break;
        }

        System.out.println(message);
    }

    //Task2
    public static void task2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во часов (от 0 до 24)");
        int hour = scanner.nextInt();

        if(hour >= 0 && hour <= 24){

            if(hour >= 6 && hour < 12){
                System.out.println("Доброе утро!");
            }
            if(hour >= 12 && hour < 17){
                System.out.println("Добрый день!");
            }
            if(hour >= 17 && hour < 22){
                System.out.println("Добрый вечер!");
            }
            if((hour >= 22 && hour <= 24) || (hour >= 0 && hour < 6)){
                System.out.println("Доброй ночи!");
            }

        } else {
            System.out.println("Вы ввели некорректные данные");
        }
    }
}