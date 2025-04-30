package modulo2.laboratorio1;

public class Main {
    public static void main(String[] args) {
        // Creación de instancias de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Juan", 20, 7.5);
        Estudiante estudiante2 = new Estudiante("María", 22, 8.0);
        Estudiante estudiante3 = new Estudiante("Pedro", 21, 6.5);

        // Mostrar detalles de cada estudiante
        System.out.println("Detalles del estudiante 1:");
        estudiante1.mostrarDetalles();
        System.out.println();

        System.out.println("Detalles del estudiante 2:");
        estudiante2.mostrarDetalles();
        System.out.println();

        System.out.println("Detalles del estudiante 3:");
        estudiante3.mostrarDetalles();
        System.out.println();

        // Calcular y mostrar el promedio de notas
        double promedio = (estudiante1.getNota() + estudiante2.getNota() + estudiante3.getNota()) / 3.0;
        System.out.println("El promedio de notas de los estudiantes es: " + promedio);

    }
}
