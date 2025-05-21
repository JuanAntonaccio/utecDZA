package modulo3.array;

import java.util.Arrays;

public class Ej24 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{1, 2}, {3, 4}};
        int[][] matriz3 = {{4, 3}, {2, 1}};

        boolean iguales = Arrays.deepEquals(matriz1, matriz2);
        System.out.println("¿Son matriz1 y matriz2 iguales? " + iguales);

        iguales = Arrays.deepEquals(matriz1, matriz3);
        System.out.println("¿Son matriz1 y matriz3 iguales? " + iguales);
    }
}
