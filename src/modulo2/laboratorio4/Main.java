package modulo2.laboratorio4;

public class Main {
    public static void main(String[] args) {
        Persona paciente = new Paciente("Laura Pérez", 34, 1023);
        Persona doctor = new Doctor("Dr. Andrés Gómez", 45, "Cardiología");

        System.out.println("Información del Paciente:");
        paciente.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Doctor:");
        doctor.mostrarInformacion();
    }
}

