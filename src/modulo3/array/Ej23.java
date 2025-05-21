package modulo3.array;

import java.util.Arrays;

public class Ej23 {
    public static void main(String[] args) {
        int[] numeros = {15, 33, 23, 7, 12};
        // sino ordeno el array antes de la busqueda no lo encuentra
        Arrays.sort(numeros);
        int buscar = 7;
        int indice = Arrays.binarySearch(numeros, buscar);
        if (indice >= 0) {
            System.out.println("Elemento " + buscar + " encontrado en el índice: " + indice);
        } else {
            System.out.println("Elemento " + buscar + " no encontrado en el array.");
        }
    }
}
