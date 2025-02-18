import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class training {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду (add, list, remove, exit: ");
            String command = scanner.nextLine();

            if (command.startsWith("add")) ;
            String task = command.substring(4);
            tasks.add(task);
            System.out.println("The task is added to list: " + task);
        }
    }
}