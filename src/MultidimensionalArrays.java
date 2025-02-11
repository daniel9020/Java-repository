public class MultidimensionalArrays {
    public static void main(String [] args){
        int[] number = {1, 2, 3};
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrice[2] [2]); // отсчет идет от нуля
        System.out.println(matrice[0] [2]);
    }
}