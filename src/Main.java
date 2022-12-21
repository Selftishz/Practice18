import java.util.Scanner;

public class Main {
    public static void Task2() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer ");
            String input = scan.next();
            int InputValue = 0;
            try {
                InputValue = Integer.parseInt(input);

                try {
                    System.out.println(2 / InputValue);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Attempted division by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Attempted to write non-numbers to integer");
            }
        }
    }

    public static void Task4() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer ");
            String input = scan.next();
            int InputValue = 0;
            try {
                int i = Integer.parseInt(input);
                System.out.println(2 / i);
                break;
            } catch(ArithmeticException e){
                System.out.println("Attempted division by zero");
            } catch(NumberFormatException e){
                System.out.println("Attempted to write non-numbers to integer");
            }finally {
                System.out.println("Окончание выполнения 4 задания");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Задача 2");
        Task2();
        System.out.println("Задание 4");
        Task4();
    }

}