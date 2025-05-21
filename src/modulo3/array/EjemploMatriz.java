package modulo3.array;

public class EjemploMatriz {
    public static void main(String[] args) {
        int [] arreglo = new int[10];
        int otro [] = {12,14,23,10};

        int [][] matriz = new int[10][10];
        int [][] otraMatriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int fila = 0; fila < otraMatriz.length; fila++) {
            for (int columna = 0; columna < otraMatriz[fila].length; columna++) {
                System.out.print(otraMatriz[fila][columna]+"  ");
            }
            System.out.println();
        }

        int suma = 0;
        for (int fila = 0; fila < otraMatriz.length; fila++) {
            for (int columna = 0; columna < otraMatriz[fila].length; columna++) {
                suma= suma+otraMatriz[fila][columna];
            }
        }
        System.out.println("La suma de los elementos es: "+suma);

    }
}
