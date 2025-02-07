import java.util.Scanner;

public class Switch {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the age");
        String age = scanner.nextLine();
        switch(age){
            case "zero":
                System.out.println("You are born");
                break;
            case "seven" :
                System.out.println("You are going to school");
                break;
            case "eighteen" :
                System.out.println("You are ended the school");
                break;
            default:
                System.out.println("Not stated");
        }
    }
}
