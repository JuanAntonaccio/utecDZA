package modulo3.laboratorio3;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        // Parte 1: Algoritmo de Ordenamiento - Burbuja
        int[] arregloDesordenado = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Arreglo Desordenado: " + Arrays.toString(arregloDesordenado));

        // Utilizar el algoritmo de ordenamiento de burbuja
        Ordenamiento.ordenamientoBurbuja(arregloDesordenado);

        System.out.println("Arreglo Ordenado: " + Arrays.toString(arregloDesordenado));

        // Parte 2: Algoritmo de Búsqueda - Búsqueda Binaria
        int[] arregloOrdenado = {11, 12, 22, 25, 34, 64, 90};
        //int []arregloOrdenado = {64, 34, 25, 12, 22, 11, 90};
        int valorABuscar = 34;
        System.out.println();
        System.out.println("=".repeat(80));
        System.out.println("Arreglo Ordenado antes de la busqueda: " + Arrays.toString(arregloOrdenado));
        System.out.println("Valor a Buscar: " + valorABuscar);

        // Utilizar el algoritmo de búsqueda binaria
        int resultadoBusqueda = Busqueda.busquedaBinaria(arregloOrdenado, valorABuscar);

        if (resultadoBusqueda != -1) {
            System.out.println("El valor " + valorABuscar + " está presente en la posición " + resultadoBusqueda);
        } else {
            System.out.println("El valor " + valorABuscar + " no está presente en el arreglo");
        }
    }

}
