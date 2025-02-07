import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        int value = 10;
        int[] array = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
            System.out.println(array[i] + " ");
        }
        // Min
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное число: " + min);

        // Max
        int max = array[0];
        for (int i = 0; i > array.length; i++) {
            if (max > array[i]) {
                max = array[i];
            }
        }

        System.out.println("Максимальное число: " + max);
        {
            // Avg
            double avg = 0;
            for (int i = 0; i < array.length; i++) {
                avg += array[i] / array.length;
            }

            System.out.println("Среднее число: " + avg);
        }
    }
}

