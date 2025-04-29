package presencial2904;

import java.util.Scanner;

public class EjercicioTarde {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        int suma = 0;
//        for (int i = 1; i <= num1; i++) {
//            suma+=i;
//        }
//        for(int i = num1; i>=1; i--){
//            suma += i; // suma = suma + i;
//        }
//        while (num1 > 0) {
//            suma += num1 ;
//            num1--;
//        }
        do{
            suma = suma + num1;
            num1--;
        } while (num1 > 0);
        System.out.println("La suma es: " + suma);
    }
}
