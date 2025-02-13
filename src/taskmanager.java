import java.util.ArrayList;
// реализация интерфейса List.
// массив, который автоматически увеличивает свой размер при добавлении новых элементов.
// Позволяет хранить null-значения.
// Быстрый доступ по индексу (O(1)), но модификация списка, особенно в начале, может быть медленной (O(n)), так как требует перемещения элементов.
// Конструкторы: В ArrayList доступны разные конструкторы:
// ArrayList() — создаёт пустой список.
// ArrayList(Collection c) — создаёт список, инициализированный элементами из другой коллекции.
// ArrayList(int initialCapacity) — создаёт список с указанным начальным размером.
import java.util.List;
// List — это интерфейс в Java,
// который расширяет интерфейс Collection.
// Он определяет структуру данных для упорядоченных коллекций (списков),
// в которых элементы могут дублироваться.
// Позволяет хранить элементы в определённом порядке (индексы начинаются с 0).
// Объекты могут дублироваться.
// Обеспечивает доступ к элементам по индексу (можно получать, добавлять и удалять элементы на основе их позиции).
import java.util.Scanner;

public class taskmanager{

    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду (add, list, remove, exit): ");
            String command = scanner.nextLine();

            // AddTask
            if (command.startsWith("add ")) {
                String task = command.substring(4); // Text
                //substring, так понял, берет часть строки
                tasks.add(task); // AddToList
                System.out.println("Задача добавлена - " + task);

            }
            // Tsks
            else if (command.equals("list")) {
                if (tasks.isEmpty()) {
                    System.out.println("Задач нет");

                } else {
                    System.out.println("Текущие задачи:");
                    for (int tasknum = 0; tasknum < tasks.size(); tasknum++) {
                        System.out.println((tasknum + 1) + ". " + tasks.get(tasknum)); // NumbersWithTasks

                    }
                }
            }
            // RemoveTask
            else if (command.startsWith("remove ")) {
                try {
                    int index = Integer.parseInt(command.substring(7)) - 1; // OurNumber
                    String removedTask = tasks.remove(index); // RemoveThheTask
                    System.out.println("Задача удалена - " + removedTask);

                } catch (IndexOutOfBoundsException | NumberFormatException e) {
                    // IndexOutOfBoundsException - вне диапазона
                    // NumberFormatException - Попытка конвертировать строку с символами которые не могут быть интерпретированы как число
                    System.out.println("Ошибка: неверный номер задачи :(");
                    // пытается выполнить инструкции в try, в случае ошибки выполняет catch
                }
            }
            // Exit
            else if (command.equals("exit")) {
                System.out.println("Выход из программы.");
                break;

            }
            // Unknownn
            else {
                System.out.println("Неизвестная команда.");

            }
        }
    }
}
// честно говоря, много пришлось гуглить