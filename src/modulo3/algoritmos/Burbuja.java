package modulo3.algoritmos;

import java.util.Arrays;

public class Burbuja {
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        do {
            intercambio = false;
            for (int i = 0; i < n - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                    intercambio = true; // Marcar que se ha hecho un intercambio
                }
            }
            System.out.println(Arrays.toString(arreglo));
            // Reducir el número de elementos a revisar
            n--;
        } while (intercambio);
    }

    public static void main(String[] args) {
        int[] datos = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Arreglo original:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
        System.out.println();

        ordenarBurbuja(datos);

        System.out.println("Arreglo ordenado:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
}
