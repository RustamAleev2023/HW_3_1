import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();

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
}