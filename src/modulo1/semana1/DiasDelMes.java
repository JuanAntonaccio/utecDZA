package modulo1.semana1;

import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 12 que represente un mes: ");
        int numeroMes = scanner.nextInt();

        int diasDelMes;
        String nombreMes;

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                diasDelMes = 31;
                break;
            case 2:
                nombreMes = "Febrero";
                diasDelMes = 28; // No se considera bisiesto en este ejemplo
                break;
            case 3:
                nombreMes = "Marzo";
                diasDelMes = 31;
                break;
            case 4:
                nombreMes = "Abril";
                diasDelMes = 30;
                break;
            case 5:
                nombreMes = "Mayo";
                diasDelMes = 31;
                break;
            case 6:
                nombreMes = "Junio";
                diasDelMes = 30;
                break;
            case 7:
                nombreMes = "Julio";
                diasDelMes = 31;
                break;
            case 8:
                nombreMes = "Agosto";
                diasDelMes = 31;
                break;
            case 9:
                nombreMes = "Septiembre";
                diasDelMes = 30;
                break;
            case 10:
                nombreMes = "Octubre";
                diasDelMes = 31;
                break;
            case 11:
                nombreMes = "Noviembre";
                diasDelMes = 30;
                break;
            case 12:
                nombreMes = "Diciembre";
                diasDelMes = 31;
                break;
            default:
                nombreMes = "Mes inválido";
                diasDelMes = -1;
        }

        if (diasDelMes != -1) {
            System.out.println("El mes de " + nombreMes + " tiene " + diasDelMes + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe ingresar un valor entre 1 y 12.");
        }
    }
}

