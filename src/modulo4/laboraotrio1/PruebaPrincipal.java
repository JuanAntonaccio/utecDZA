package modulo4.laboraotrio1;

public class PruebaPrincipal {
    public static void main(String[] args) {
        Vuelo[] vuelos = new Vuelo[2];
        vuelos[0] = new AerolineaEconomica(101, "Ciudad A", "Ciudad B");
        vuelos[1] = new AerolineaPremium(202, "Ciudad C", "Ciudad D");

        for (Vuelo vuelo : vuelos) {
            vuelo.mostrarDetallesVuelo();
            vuelo.reservarAsiento();
            double descuento = vuelo.calcularDescuento();
            System.out.println("Descuento aplicable: " + descuento);
        }
    }

}
