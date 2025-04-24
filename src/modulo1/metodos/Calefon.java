package modulo1.metodos;

public class Calefon {

    public static void main(String[] args) {
        int temperatura = 20;
        int aguaCaliente = calentarAgua(temperatura);
        System.out.println("Agua caliente a " + aguaCaliente + " grados.");
    }

    public static int calentarAgua(int temperatura) {
        procesaEntrada();
        procesar();
        return generarSalida(temperatura);
    }

    private static void procesaEntrada() {
        System.out.println("Recibiendo agua fría...");
    }

    private static void procesar() {
        System.out.println("Calentando el agua...");
    }

    private static int generarSalida(int temperatura) {
        System.out.println("Devolviendo agua caliente...");
        return temperatura + 35; // Aumenta la temperatura como ejemplo de procesamiento
    }
}
