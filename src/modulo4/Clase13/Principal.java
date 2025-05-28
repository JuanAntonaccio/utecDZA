package modulo4.Clase13;

public class Principal {
    public static void main(String[] args) {
        Animal tobi = new Perro(); //refernciar a una interfaz
        Animal miyu = new Gato();

        tobi.hacerSonido();
        miyu.hacerSonido();

    }
}
