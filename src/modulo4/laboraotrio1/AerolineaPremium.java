package modulo4.laboraotrio1;

public class AerolineaPremium extends Aerolinea {
    public AerolineaPremium(int numeroVuelo, String origen, String destino) {
        super(numeroVuelo, origen, destino);
    }

    @Override
    public void reservarAsiento() {
        // Implementación específica para aerolínea premium
    }

    @Override
    public void mostrarDetallesVuelo() {
        // Implementación específica para aerolínea premium
    }

    @Override
    public double calcularDescuento() {
        // Implementación específica para aerolínea premium
        return 0.2; // Ejemplo: Descuento del 20%
    }

    @Override
    public void mostrarInformacionAerolinea() {
        // Implementación específica para aerolínea premium
    }

}
