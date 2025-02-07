import java.util.Scanner;

public class Input {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите какое-нибудь число: ");
        int x = s.nextInt();
        System.out.println("Вы ввели: " + x); {
            {
        }
        // Вопрос: как делать сразу несколько вводов?
        System.out.println("Ввод: ");
        String str = s.nextLine();
        System.out.println("Вы написали: " + str);
    }
}}
