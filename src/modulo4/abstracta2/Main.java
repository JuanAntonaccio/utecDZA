package modulo4.abstracta2;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal(); // Esto dará error porque no se puede instanciar una clase abstracta directamente.

        Animal boby = new Perro(); // Esto es correcto. Usamos el tipo de referencia de la clase abstracta para referenciar un objeto de una clase concreta.
        boby.comer();             // Llama al método implementado en la clase Perro.
        boby.respirar();          // Llama al método heredado de la clase Animal.
    }
}
