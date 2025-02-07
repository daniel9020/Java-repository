public class Continue {
    public static void main(String [] args) {
        for(int i = 0; i<=15; i++){
            // для for 1 - значение цикла это изначальное число. 2 - Выполнять до этого числа. 3 - что производить каждое действие
            if(i%2==0){
                continue;
            }
            System.out.println("Нечетное число " + i);
        }
    }
}
