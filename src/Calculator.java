import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // FirstNumber
        System.out.println("Введи первое число: ");
        float first = scanner.nextFloat();

        System.out.println("Введи второе число: "); // SecondNumber
        float second = scanner.nextFloat();

        System.out.println("Введи операцию (+,-,*,/): "); // Operation
        char symbol = scanner.next().charAt(0);

        switch (symbol){
        case '+': { // IfPlus
            float result = (first + second);
            System.out.println("Сумма чисел " + first + " и " + second + " равна " + result);
            break;
            }
            case '-': {// IfMinus
            float resultTwo = (first - second);
            System.out.println("Разница чисел " + first + " и " + second + " равна " + resultTwo);
            break;
        }
            case '*': { // IfMultiply
            float resultThree = (first * second);
            System.out.println("Произведение чисел " + first + " и " + second + " равна " + resultThree);
            break;
    }
        case '/': { // IfDivide
            float resultFour = (first / second);
            System.out.println("Разность чисел " + first + " и " + second + " равна " + resultFour);
            break;
            default:
                System.out.println("Условие выполнено неверно.");
}}}}
