package modulo4.laboraotrio1;

public abstract class Aerolinea implements Vuelo {
    protected int numeroVuelo;
    protected String origen;
    protected String destino;

    public Aerolinea(int numeroVuelo, String origen, String destino) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
    }

    public abstract void mostrarInformacionAerolinea();

}
