package presencial2904;


public class EjemploPrintf {
    public static void main(String[] args) {
        String nombre = "Ana";
        int edad = 28;
        double promedio = 9.678;

        System.out.printf("Nombre: %s%n", nombre);
        System.out.printf("Edad: %d años%n", edad);
        System.out.printf("Promedio: %.2f%n", promedio); // Redondea a 2 decimales
        System.out.printf("Promedio con ancho: %8.2f%n", promedio); // Ocupa al menos 8 caracteres
        System.out.printf("Literal de porcentaje: 100%%%n");
        System.out.println();
        System.err.println("⚠ Error: Operacion no permitida.");
    }
}

