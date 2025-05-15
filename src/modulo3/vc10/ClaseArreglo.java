package modulo3.vc10;

import java.util.Arrays;

public class ClaseArreglo {
    public static void main(String[] args) {
        int [] numeros = new int [10];
        System.out.println(numeros);// no es igual que las listas - no puedo ver el contenido
        System.out.println(Arrays.toString(numeros)); // para ver el contenido de un array
        //System.out.println(numeros[10]);
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]=i*3+10;
        }
        System.out.println(Arrays.toString(numeros));
        numeros[0]=100;
        System.out.println(Arrays.toString(numeros));
        // hacer el promedio
        double promedio =sumarArray(numeros);
        System.out.println("El promedio es: "+promedio);
    }

    private static double sumarArray(int[] numeros) {
        double promedio=0;
        double suma=0;
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
        }
        promedio=suma/numeros.length;
        return promedio;

    }
}
