package modulo4.interface3;

public class Bicicleta implements Vehiculo{
    public void acelerar() {
        System.out.println("Bicicleta acelerando...");
    }

    public void frenar() {
        System.out.println("Bicicleta frenando...");
    }

    // Sobrescribir el método default
    @Override
    public void describir() {
        System.out.println("Yo soy una bicicleta.");
    }
}
