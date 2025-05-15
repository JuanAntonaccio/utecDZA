package modulo3.laboratorio1;

import java.util.LinkedList;

public class PruebaAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Adrian",20,(byte)4);
        Alumno a2 = new Alumno("Maria",24,(byte)4);
        Alumno a3 = new Alumno("Ana",26,(byte)4);
        Alumno a4 = new Alumno("Facundo",18,(byte)4);
        Alumno a5 = new Alumno("Juan",33,(byte)4);
        LinkedList<Alumno> alumnos = new LinkedList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        System.out.println(alumnos);
        System.out.println("Tamaño de la lista es:" +alumnos.size());// Tamaño ??
        mostrarDatos(alumnos);
        alumnos.add(2,new Alumno("Agustin",18,(byte)4));
        mostrarDatos(alumnos);
        alumnos.set(5,new Alumno("Soraya",36,(byte)4)); // modifica
        alumnos.remove(4);
        mostrarDatos(alumnos);
        System.out.println("Esta vacia ?"+alumnos.isEmpty());
        System.out.println("Contiene a Facundo ?"+alumnos.contains(a4));
        System.out.println("Contiene a Adrian ?"+alumnos.contains(a1));

    }

    private static void mostrarDatos(LinkedList<Alumno> alumnos) {
        System.out.println("-".repeat(80));
        for (int i = 0; i < alumnos.size() ; i++) {
            System.out.print(alumnos.get(i).getNombre() + " -- ");
            System.out.print(alumnos.get(i).getEdad() + " -- ");
            System.out.println(alumnos.get(i).getNota());
        }
    }
}
