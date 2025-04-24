package modulo1.semana1;

public class PrimerCodigo {
    public static void main(String[] args) {
       // Declaracion de variables
        String nombreEstudiante;
        int edad;
        double nota;
        boolean estaAprobado;

        // Asginar valore a las variables
        nombreEstudiante = "Pedro";
        edad = 30;
        nota = 3.5; // en la escala de UTEC
        estaAprobado = nota >= 3;

        // Mostrar la informacion
        System.out.println("Estudiante: "+nombreEstudiante );
        System.out.println("Edad: "+ edad);
        System.out.println("Nota: "+nota);
        System.out.println("EstaAprobado: "+estaAprobado);

        //  Debo modificar los datos
        nota = 2.5;
        // Actualizo el estado de aprobacion
        estaAprobado = nota >= 3;

        // Muesto las notas nuevamente
        System.out.println("=".repeat(80));

        // Mostrar de nuevo datos del estudiante
        System.out.println("Estudiante: "+nombreEstudiante );
        System.out.println("Edad: "+ edad);
        System.out.println("Nota: "+nota);
        System.out.println("EstaAprobado: "+estaAprobado);

    }
}
