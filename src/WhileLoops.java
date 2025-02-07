public class WhileLoops {
    public static void main(String [] args) {
        boolean t = true;
        System.out.println(t);
        boolean tr = 5>4;
        System.out.println(tr);
        boolean f = 10<2;
        System.out.println(f);
        boolean fal = 51>=52;
        System.out.println(fal);
        int value = 0;
        boolean bool = value>2;
        while(value<5){
            System.out.println("Hello number " + value);
            value = value + 1;
            int int1 = 0; // с какого числа начинается отсчет
            while(int1<=500){ // до какого числа будут производится действия
                System.out.println("test " + int1); // вывод
                int1 = int1 + 5; // число которое прибавляется каждый круг
            }
        }
    }
}
