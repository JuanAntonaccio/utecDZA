package modulo3.laboratorio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {15, 3, 8, 22, 10, 5, 42, 17, 30, 1};

        System.out.println("Array original:");
        Ordenamiento.mostrarArray(numeros);

        Ordenamiento.ordenarPorSeleccion(numeros);
        System.out.println("Array ordenado de mayor a menor:");
        Ordenamiento.mostrarArray(numeros);

        System.out.print("Ingrese el valor a buscar: ");
        int valor = scanner.nextInt();

        int posicion = Busqueda.buscarSecuencial(numeros, valor);

        if (posicion != -1) {
            System.out.println("Valor encontrado en la posición: " + posicion);
        } else {
            System.out.println("El valor no se encuentra en el array.");
        }

        scanner.close();

    }
}
