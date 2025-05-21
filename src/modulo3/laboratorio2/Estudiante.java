package modulo3.laboratorio2;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private int[] notas = new int[3];

    public Estudiante(String nombre, int[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public double promedio(){
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }
}
