package modulo2.laboratorio3;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anioFabricacion, int cilindrada) {
        super(marca, modelo, anioFabricacion);
        this.cilindrada = cilindrada;
    }

//    @Override
//    public void mostrarInformacion() {
//        super.mostrarInformacion();
//        System.out.println("Cilindrada: " + cilindrada + " cc");
//    }

}
