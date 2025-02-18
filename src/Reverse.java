public class Reverse {

    public static String reverseString(String input) {
        if (input == null) { // Check
            return null;
        }

        // StringBuilderForReverse
        StringBuilder reversed = new StringBuilder(input);

        // Reverse
        return reversed.reverse().toString();
    }
    public static void main(String[] args) {
        String original = "А роза упала на лапу Азора";
        String reversed = reverseString(original);

        System.out.println("Оригинальная строка: " + original);
        System.out.println("Перевернутая строка: " + reversed);
    }
}
