import java.util.Scanner;

public class doWhile {
    public static void main(String [] args) {
        Scanner newscan = new Scanner(System.in);
        int value;
        do { // Вход
            System.out.println("Введи 5"); // Условие
            value = newscan.nextInt(); // Ввод
        } while(value != 5); // Завершение цикла после выполненного условия
        System.out.println("Ты ввёл 5");
        }
    }
