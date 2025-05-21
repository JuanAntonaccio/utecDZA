package modulo3.array;

import java.util.Arrays;

public class Ej20 {
    public static void main(String[] args) {
        int[] array1 = {4, 7, 2, 8, 1};
        int[] array2 = {4, 7, 2, 8, 1};
        int[] array3 = {1, 2, 7, 4, 8};

        boolean iguales = Arrays.equals(array1, array2);
        System.out.println("¿Son array1 y array2 iguales? " + iguales);

        iguales = Arrays.equals(array1, array3);
        System.out.println("¿Son array1 y array3 iguales? " + iguales);
    }
}
