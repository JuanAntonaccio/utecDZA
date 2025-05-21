package modulo3.array;

import java.util.Arrays;

public class Ej22 {
    public static void main(String[] args) {
        int[] numeros = {22, 17, 35, 80};
        int[] copiaNumeros = Arrays.copyOf(numeros,numeros.length);
        System.out.println("Copia de numeros : " + Arrays.toString(copiaNumeros));
    }
}
