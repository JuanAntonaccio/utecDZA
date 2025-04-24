package modulo1.metodos;

public class Programa {
    public static void main(String[] args) {
        algoritmo();
        System.out.println("Fin del programa !");
    }

    private static void algoritmo() {
        int p=50;
        int g=34;
        int suma=sumaleDiez(p+g);
        suma++;
        suma++;
        System.out.println(suma);
    }

    private static int sumaleDiez(int numero) {
        return numero+10;
    }
}
