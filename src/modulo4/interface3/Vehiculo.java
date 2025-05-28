package modulo4.interface3;

public interface Vehiculo {
    void acelerar();
    void frenar();

    default void describir() {
        System.out.println("Yo soy un vehículo.");
    }
    default void conducir(){
        System.out.println("Estoy conduciendo");
    }
}
