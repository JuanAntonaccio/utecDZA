package modulo3.laboratorio2;

import java.util.Random;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ivan",generarNotasAleatorias(3));
        Estudiante e2 = new Estudiante("Maria",generarNotasAleatorias(3));
        Estudiante e3 = new Estudiante("Alan",generarNotasAleatorias(3));
        Estudiante e4 = new Estudiante("Ana",generarNotasAleatorias(3));
        Estudiante estudiantes[] = {e1,e2,e3,e4};
        double suma=0;
        double mayor=0;
        int indice=0;
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
            System.out.println("El promedio de: "+estudiantes[i].getNombre()+" es :"+estudiantes[i].promedio());
            suma+=estudiantes[i].promedio();
            if (estudiantes[i].promedio()>mayor){
                mayor=estudiantes[i].promedio();
                indice=i;
            }
        }
        System.out.println("El promedio de todos los estudiantes: "+suma/estudiantes.length);
        System.out.println("Es estudiante :"+estudiantes[indice]+" Es el de mayor promedio"+mayor);
    }
    public static int[] generarNotasAleatorias(int cantidadNotas) {
        int[] notas = new int[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            notas[i] = (int)(Math.random() * 100)+1; // genera valores entre 1 y 100
        }
        return notas;
    }

    public static int[] generarNotas(int cantidadNotas) {
        int[] notas = new int[cantidadNotas];
        Random rand = new Random();
        for (int i = 0; i < cantidadNotas; i++) {
            notas[i] = rand.nextInt(100) + 1; // entre 1 y 100
        }
        return notas;
    }
}
