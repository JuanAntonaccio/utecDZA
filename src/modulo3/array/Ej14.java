package modulo3.array;

public class Ej14 {
    public static void main(String[] args) {
        // inicializar array bidimensionales
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int primerElemento = matriz[0][0]; // Accediendo al primer elemento de la matriz
        int elementoCentral = matriz[1][1]; // Accediendo al elemento central de la matriz
        int ultimoElemento = matriz[matriz.length - 1][matriz[0].length - 1]; // Accediendo al último elemento de la matriz
        System.out.println("Primer elemento: " + primerElemento);
        System.out.println("Elemento central: " + elementoCentral);
        System.out.println("Último elemento: " + ultimoElemento);
        // Mostando todos los elementos de la matriz
        for(int i=0;i< matriz.length;i++){
            System.out.println("Para i ="+i);
            for(int k=0;k<matriz[0].length;k++){
                System.out.print(matriz[i][k]+" - ");
            }
            System.out.println();
            System.out.println("-----------------------");
        }
    }
}
