package presencial2904;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num1 = sc.nextInt();
        if (num1 < 0){
            System.out.println("Numero invalido");
        } else {
            boolean resultado = esCapicua(num1);
            String mensaje = resultado ? "Es capicua" : "No es capicua";
            System.out.println("El numero " + num1 + " " + mensaje);
        }
    }

    private static boolean esCapicua(int numero) {
        boolean resultado = false;
        int numeroInicial=numero;
        int resto, nuevoNumero=0;
        while (numero > 0) {
            resto = numero % 10;
            numero = numero / 10;
            nuevoNumero = nuevoNumero*10+resto;
        }
        System.out.println("Mi nuevo numero es: " + nuevoNumero);
        resultado = numeroInicial == nuevoNumero;
        return resultado;
    }
}
