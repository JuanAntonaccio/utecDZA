package modulo3.laboratorio1;

public class Alumno {
    private String nombre;
    private int edad;
    private byte nota;

    // Construtor con los atributos
    public Alumno(String nombre, int edad, byte nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    // Constructor vacio (sin atributos)
    public Alumno() {
    }

    // getters y setters
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

    public byte getNota() {
        return nota;
    }

    public void setNota(byte nota) {
        this.nota = nota;
    }

    // Metodo toString

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota=" + nota +
                '}';
    }
}
