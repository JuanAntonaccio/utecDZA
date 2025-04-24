package modulo1.metodos;

public class Ejercicio {
    public static void main(String[] args) {
        String nombre="Juan";
        int edad=45;
        mostrar(nombre,edad);
    }

    private static int mostrar(String name, int age) {
        System.out.println("Hola "+name+" tu edad es "+age);
        return age;
    }
}
