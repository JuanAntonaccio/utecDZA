package modulo2.laboratorio1;

public class Estudiante {
    private String nombre;
    private int  edad;
    private double nota;

    // Constructor
    public Estudiante(String nombre, int edad, double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    // Métodos getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Detalles del estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota: " + nota);
    }

}
