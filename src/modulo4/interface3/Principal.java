package modulo4.interface3;

public class Principal {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.acelerar();
        miCoche.frenar();
        miCoche.describir();  // Llama al método default
    }
}
