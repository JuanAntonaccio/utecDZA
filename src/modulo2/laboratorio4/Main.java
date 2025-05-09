package modulo2.laboratorio4;

public class Main {
    public static void main(String[] args) {
        Persona paciente = new Paciente("Laura Pérez", 34, 1023);
        Persona doctor = new Doctor("Dr. Andrés Gómez", 45, "Cardiología");
        Persona persona = new Persona();

        System.out.println("Información del Paciente:");
        paciente.saludo();
        paciente.mostrarInformacion();
        System.out.println("-".repeat(80));

        System.out.println("Información del Doctor:");
        doctor.saludo();
        doctor.mostrarInformacion();

        System.out.println("-".repeat(80));
        System.out.println("Información de Persona:");
        persona.saludo();
        persona.mostrarInformacion();

        boolean consulta = paciente instanceof Paciente;
        System.out.println(consulta);
        consulta = doctor instanceof Paciente;
        boolean consulta2= doctor instanceof Persona;
        System.out.println();
        System.out.println(consulta+" "+consulta2);
        System.out.println();
        consulta = persona instanceof Doctor;
        System.out.println("Una persona es un Doctor?"+consulta);

    }
}

