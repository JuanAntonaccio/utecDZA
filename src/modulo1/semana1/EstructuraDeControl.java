package modulo1.semana1;

import java.util.Scanner;

public class EstructuraDeControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            // Declaración de Variables
            String nombreEstudiante;
            double notaEstudiante;

            System.out.print("Ingrese el nombre del estudiante: ");
            nombreEstudiante = scanner.nextLine();

            System.out.print("Ingrese la nota del estudiante: ");
            notaEstudiante = scanner.nextDouble();

            System.out.println("\nInformación del Estudiante:");
            System.out.println("Nombre: " + nombreEstudiante);
            System.out.println("Nota: " + notaEstudiante);

            boolean estaAprobado = notaEstudiante >= 70;
            System.out.println("¿Está Aprobado?: " + estaAprobado);

            if (!estaAprobado) {
                System.out.println("\nNo Aprobado.");
                System.out.print("¿Desea realizar la prueba adicional? (Sí/No): ");
                String respuesta = scanner.next();

                if (respuesta.equalsIgnoreCase("Sí")) {
                    System.out.print("Ingrese la nueva nota después de la prueba adicional: ");
                    double nuevaNota = scanner.nextDouble();
                    notaEstudiante = nuevaNota;
                    estaAprobado = notaEstudiante >= 70;
                    System.out.println("¿Está Aprobado ahora?: " + estaAprobado);
                }
            }

            System.out.print("\n¿Desea ingresar información para otro estudiante? (Sí/No): ");
            String continuarInput = scanner.next();
            continuar = continuarInput.equalsIgnoreCase("Sí");

            // Limpiar el buffer del scanner
            scanner.nextLine();
        }

        // Cerrar el scanner
        scanner.close();
    }
}

