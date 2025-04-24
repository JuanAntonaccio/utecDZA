package modulo1.semana1;

import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7 para saber el día de la semana: ");
        int numeroDia = scanner.nextInt();

        String nombreDia;

        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número inválido. Debe ingresar un número entre 1 y 7.";
        }

        System.out.println("Resultado: " + nombreDia);
    }
}
