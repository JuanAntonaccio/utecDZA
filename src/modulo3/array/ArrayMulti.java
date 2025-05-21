package modulo3.array;

public class ArrayMulti {
    public static void main(String[] args) {
        // Inicializar un array multidimensional
        // Dos dimensiones

        int numeros[][] = new int[2][5]; // filas -- columnas
        numeros[0][0] = 1;
        numeros[1][1] = 5;
//        for (int i = 0; i < numeros.length; i++) {
//            for (int j = 0; j < numeros[i].length; j++) {
//                System.out.print(numeros[i][j] + " -- ");
//            }
//            System.out.println();
//        }
        for (int fila = 0; fila < numeros.length ; fila++) {
            for (int columna = 0; columna < numeros[fila].length ; columna++) {
                System.out.print(numeros[fila][columna] + " ** ");
            }
            System.out.println();
        }



    }
}
