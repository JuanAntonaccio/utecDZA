package modulo4.laboraotrio1;

public class AerolineaEconomica extends Aerolinea{
    public AerolineaEconomica(int numeroVuelo, String origen, String destino) {
        super(numeroVuelo, origen, destino);
    }

    @Override
    public void reservarAsiento() {
        // Implementación específica para aerolínea económica
    }

    @Override
    public void mostrarDetallesVuelo() {
        // Implementación específica para aerolínea económica
    }

    @Override
    public double calcularDescuento() {
        // Implementación específica para aerolínea económica
        return 0.1; // Ejemplo: Descuento del 10%
    }

    @Override
    public void mostrarInformacionAerolinea() {
        // Implementación específica para aerolínea económica
    }

}
