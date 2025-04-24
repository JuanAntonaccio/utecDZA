package modulo1.metodos;

public class Funciones {
    public static void main(String[] args) {
        String a="Fiat", b="Premio", c="Diesel";
        mostrarAuto(b,c,a);
    }
    private static void mostrarAuto(String marca, String modelo, String tipo) {
        String mensaje="El auto de marca: "+marca+" es del modelo "+modelo+" usa combustible "+tipo;
        System.out.println(mensaje);
    }
}
