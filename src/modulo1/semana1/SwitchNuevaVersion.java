package modulo1.semana1;


import java.util.Scanner;

public class SwitchNuevaVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        String resultado = switch (numeroMes) {
            case 1 -> "Enero tiene 31 días.";
            case 2 -> esBisiesto ? "Febrero tiene 29 días (año bisiesto)." : "Febrero tiene 28 días.";
            case 3 -> "Marzo tiene 31 días.";
            case 4 -> "Abril tiene 30 días.";
            case 5 -> "Mayo tiene 31 días.";
            case 6 -> "Junio tiene 30 días.";
            case 7 -> "Julio tiene 31 días.";
            case 8 -> "Agosto tiene 31 días.";
            case 9 -> "Septiembre tiene 30 días.";
            case 10 -> "Octubre tiene 31 días.";
            case 11 -> "Noviembre tiene 30 días.";
            case 12 -> "Diciembre tiene 31 días.";
            default -> "Número de mes inválido. Debe ser entre 1 y 12.";
        };

        System.out.println(resultado);
    }
}
