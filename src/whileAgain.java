import java.util.Scanner;

public class whileAgain {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введи 5"); // изначальный текст
        int value = scan.nextInt();
        while(value!=5){ // Если ты не написал это значение, то последующая команда блока будет выполнятся
            System.out.println("Напиши '5'");
            value = scan.nextInt();
        }
        System.out.println("Вы написали 5"); // результат если ты написал то значение, которое нужно
    }
}
