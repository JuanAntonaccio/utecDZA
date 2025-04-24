package modulo1.semana1;

import java.util.Scanner;

public class ParOImparTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";
        System.out.println(resultado);
    }
}

