package modulo2.laboratorio3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anioFabricacion;

    public Vehiculo() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.anioFabricacion = 0;
    }

    // Sobrecarga de constructor con todos los parametros
    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + anioFabricacion);
    }

}
