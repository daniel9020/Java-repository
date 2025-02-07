public class Break {
    public static void main(String [] args){
        int i = 0;
        while(true){
            if(i>=1000){
                break;
            }
            i = i+1;
            System.out.println(i);
            i++;
        }
        System.out.println("Цикл окончен.");
    }
}