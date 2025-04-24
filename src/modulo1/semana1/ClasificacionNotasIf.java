package modulo1.semana1;

import java.util.Scanner;

public class ClasificacionNotasIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una nota entre 0 y 100: ");
        int nota = scanner.nextInt();
        String clasificacion;

        if (nota >= 90 && nota <= 100) {
            clasificacion = "Excelente";
        } else if (nota >= 70 && nota < 90) {
            clasificacion = "Bueno";
        } else if (nota >= 50 && nota < 70) {
            clasificacion = "Aprobado";
        } else if (nota >= 0 && nota < 50) {
            clasificacion = "Reprobado";
        } else {
            clasificacion = "Nota inválida";
        }

        System.out.println("Clasificación: " + clasificacion);
    }
}

