package modulo2.laboratorio4;

public class Paciente extends Persona {
    private int numeroHistoriaClinica;

    public Paciente(String nombre, int edad, int numeroHistoriaClinica) {
        super(nombre, edad);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Historia Clínica N°: " + numeroHistoriaClinica);
    }
}

