package modulo4.interface3;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        Bicicleta miBicicleta = new Bicicleta();
        miBicicleta.acelerar();
        miBicicleta.frenar();
        miBicicleta.describir();  // Usa la implementación sobrescrita
        Coche c1 = new Coche();
        List<Vehiculo>  lista1 = new ArrayList<>();
        lista1.add(c1);
        lista1.add(miBicicleta);
    }
}
