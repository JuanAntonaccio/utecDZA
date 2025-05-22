package modulo3.algoritmos;

import java.util.Arrays;

public class EjemplosClase9 {
    public static void main(String[] args) {
        int [] numeros = {13,25,1,-24,100,27,12};
        System.out.println(" Sin ordenar  "+Arrays.toString(numeros));
        ordenamientoBurbuja(numeros);
        System.out.println("Ordenado  "+Arrays.toString(numeros));
        int resBus = busquedaBinaria(numeros,50);
        if(resBus > 0){
            System.out.println("Encontrado en posicion: "+resBus);
        } else {
            System.out.println("No encontrado ");
        }

    }
    // metodo para ordenar un array -
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos si están en el orden incorrecto
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    // Metodo para busqueda binaria
    public static int busquedaBinaria(int[] arreglo, int valor) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Verificar si el valor está presente en la mitad
            if (arreglo[medio] == valor)
                return medio;

            // Si el valor es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < valor)
                izquierda = medio + 1;

                // Si el valor es menor, ignorar la mitad derecha
            else
                derecha = medio - 1;
        }

        // Si el valor no está presente en el arreglo
        return -1;
    }
}
