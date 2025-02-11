public class Arrays {

    public static void main(String [] args) {

        int num = 10; // примитивный тип данных     // [10]
        int[] nums = new int[5]; // nums -> [Массив] ссылочный тип данных
        for (int i = 0; i < nums.length; i++) { // 0 будет доходить до 4
            nums[i] = i * 10;
            System.out.println(nums[i]);
        }
    }
}
// В общем, В [] независимо от значения, отсчет начинается от нуля
